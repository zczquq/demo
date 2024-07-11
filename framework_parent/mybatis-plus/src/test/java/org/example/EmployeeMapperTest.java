package org.example;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.example.entity.Employee;
import org.example.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 16339
 */
@SpringBootTest
public class EmployeeMapperTest {

    // resource注解的作用是向框架要对象并赋值给引用变量
    @Resource
    EmployeeMapper employeeMapper;

    @Test
    public void test01() {
        Employee employee = new Employee();
        employee.setNickName("zcz");
        employee.setAccountName("qqqqqqq");
        employee.setPassword("123456");
        employee.setRole("经理");
        employee.setRealName("12312");
//        employeeMapper.insert(employee);
        employeeMapper.insertAndReturnId(employee);
        System.out.println(employee.toString());
    }

    @Test
    public void test02() {
        employeeMapper.deleteById(43);
    }

    @Test
    public void test03() {
        Employee employee = new Employee();
        employee.setId(42);
        employeeMapper.deleteById(employee);
    }

    @Test
    public void test04() {
        Map<String, Object> map = new HashMap<>();
        map.put("role", "经理");
        employeeMapper.deleteByMap(map);
    }

    @Test
    public void test05() {
        List<Integer> idList = Arrays.asList(38, 39);
        employeeMapper.deleteBatchIds(idList);
    }

    @Test
    public void test06() {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setRole("经理");
        // 可以用更新方法实现单行数据的逻辑删除
        // 可以给表增加更新时间防止没有输入更新条件时sql语句抛出异常
        employeeMapper.updateById(employee);
    }

    @Test
    public void test07() {
        Employee e = new Employee();
        e.setAccountName("m");
        LambdaQueryWrapper<Employee> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(StringUtils.hasText(e.getAccountName()), Employee::getAccountName, e.getAccountName());
        List<Object> list = employeeMapper.selectObjs(lambdaQueryWrapper);
    }

    @Test
    public void test08() {
        LambdaQueryWrapper<Employee> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        Employee employee = new Employee();
        employee.setSex("女");
        lambdaQueryWrapper.eq(StringUtils.hasText(employee.getSex()), Employee::getSex, employee.getSex());
        Page<Employee> page = new Page<>(1, 5);
        employeeMapper.selectPage(page, lambdaQueryWrapper);
        System.out.println("总行数" + page.getTotal());
        System.out.println("总页数" + page.getPages());
        System.out.println("当前页数" + page.getCurrent());
        System.out.println("行数" + page.getSize());
        for (Employee record : page.getRecords()) {
            System.out.println(record);
        }
    }
}
