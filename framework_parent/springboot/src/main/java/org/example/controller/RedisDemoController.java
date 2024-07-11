package org.example.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Student;
import org.example.mapper.StudentMapper;
import org.example.response.Result;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author 16339
 */
@Slf4j
@RestController
@RequestMapping("/redis")
public class RedisDemoController {

    /**
     * 1.拿到操作redis的bean
     */
    @Resource
    StringRedisTemplate stringRedisTemplate;

    @Resource
    StudentMapper studentMapper;

    /**
     * 插入操作，先插入到db，再插入到缓存
     * @param student
     * @return
     */
    @PostMapping("/insert")
    @Transactional(rollbackFor = Exception.class)
    public Object insert(Student student) {
        log.info("插入到db");
        studentMapper.insert(student);
        log.info("插入到缓存");
        stringRedisTemplate.opsForValue().set(String.valueOf(student.getId()), JSON.toJSONString(student));
        return Result.success(student);
    }

    /**
     * 更新数据
     * @param student
     * @return
     */
    @PostMapping("/update")
    @Transactional(rollbackFor = Exception.class)
    public Object update(Student student) {
        log.info("更新db");
        studentMapper.updateById(student);
        stringRedisTemplate.opsForValue().set(String.valueOf(student.getId()), JSON.toJSONString(student));
        return Result.success(student);
    }

    @PostMapping("/delete")
    @Transactional(rollbackFor = Exception.class)
    public Object delete(Student student) {
        log.info("删除");
        studentMapper.deleteById(student);
        stringRedisTemplate.delete(String.valueOf(student.getId()));
        return Result.success(student);
    }

    @PostMapping("/m1")
    public Object m1(String name) {
        // 接收HTTP报文中的name字段
        // 存入到redis缓存(缓存是map结构)
        // 前端传过来的name，后端可以查询redis存入了这个键
        stringRedisTemplate.opsForValue().set("name", name);
        return Result.success();
    }

    @PostMapping("/m2")
    public Object m2(String token) {
        // 接收HTTP报文中的name字段
        // 存入到redis缓存(缓存是map结构)
        // 前端传过来的name，后端可以查询redis存入了这个键
        // 可以设置缓存自动更新时间
        // 参数4是时间单位的枚举
        stringRedisTemplate.opsForValue().set("token", token, 10, TimeUnit.SECONDS);
        return Result.success();
    }

    /**
     * 根据key删除redis中的数据
     * @param key
     * @return
     */
    @PostMapping("/m3")
    public Object m3(String key) {
        // bean直接调用delete方法，不需要调用opsForValue()
        stringRedisTemplate.delete(key);
        return Result.success();
    }

    /**
     * 根据key的名字查询redis中的数据
     * @param key
     * @return
     */
    @PostMapping("/m4")
    public Object m4(String key) {
        log.info("key:" + key);
        String value = stringRedisTemplate.opsForValue().get(key);
        return Result.success(value);
    }

    /**
     * 将对象序列化转为json字符串存入redis内存数据库
     * @param student
     * @return
     */
    @PostMapping("/m5")
    public Object m5(Student student) {
        log.info("key:" + student);
        // 存对象方式1：将对象序列化为json字符串
        stringRedisTemplate.opsForValue().set(String.valueOf(student.getId()),JSON.toJSONString(student));
        return Result.success();
    }

    /**
     * 反序列化取出对象
     * 对null值缓存防止缓存穿透，让db中不存在的数据也放入缓存
     * @param id
     * @return
     */
    @PostMapping("/m6")
    public Object m6(String id) {
        log.info("1.查询信息，id=" + id);
        String data = stringRedisTemplate.opsForValue().get(id);
        if (StringUtils.hasText(data)) {
            log.info("2.缓存中存在数据，直接返回缓存中的数据");
            return Result.success(JSON.parseObject(data, Student.class));
        } else {
            log.info("3.缓存中不存在数据，查询MySQL数据库");
            Student student = studentMapper.selectById(id);
            if (student == null) {
                log.info("4.缓存穿透，把db中不存在的数据也放入缓存数据库中");
                student = new Student();
            }
            log.info("5.放入缓存");
            stringRedisTemplate.opsForValue().set(id, JSON.toJSONString(student));
            log.info("6.返回数据");
            return Result.success(student);
        }
    }
}
