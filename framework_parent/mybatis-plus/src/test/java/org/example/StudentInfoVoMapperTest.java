package org.example;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.mapper.StudentExamVoMapper;
import org.example.mapper.StudentInfoVoMapper;
import org.example.vo.StudentExamVo;
import org.example.vo.StudentInfoVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.sql.Wrapper;
import java.util.List;

/**
 * @author 16339
 */
@SpringBootTest
public class StudentInfoVoMapperTest {

    @Resource
    StudentInfoVoMapper studentInfoVoMapper;

    @Resource
    StudentExamVoMapper studentExamVoMapper;

    @Test
    public void test01() {
        List<StudentInfoVo> studentInfoVos = studentInfoVoMapper.selectList();
        System.out.println(studentInfoVos);
    }

    @Test
    public void test02() {
        Page<StudentExamVo> page = new Page<>(1, 5);
        long count = studentExamVoMapper.selectCount(null);
        page.setTotal(count);
        long nowNum = (page.getCurrent() - 1) * page.getSize();
        long offset = page.getSize();
        List<StudentExamVo> studentExamVoList = studentExamVoMapper.selectList(nowNum, offset, null);
        System.out.println("总行数" + page.getTotal());
        System.out.println("总页数" + page.getPages());
        System.out.println("当前页数" + page.getCurrent());
        System.out.println("行数" + page.getSize());
        for (StudentExamVo studentExamVo : studentExamVoList) {
            System.out.println(studentExamVo);
        }
    }


}
