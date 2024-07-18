package org.example;

import org.example.entity.Employee;
import org.example.mapper.EmployeeMapper;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class EmployeeMapperTest {

    /**
     * 实体类属性名和字段名不一致的解决方案
     * 1.在sql语句中给字段起别名
     * 2.设置全局配置，开启驼峰映射 将_映射为驼峰
     * <setting name="mapUnderscoreToCamelCase" value="true"/>
     * 3.resultMap自定义映射
     */

    /**
     * 测试查询所有用户
     * @throws IOException
     */
    @Test
    public void getAllEmp() throws IOException {
        EmployeeMapper employeeMapper = SqlSessionUtils.getSqlSession().getMapper(EmployeeMapper.class);
        List<Employee> employeeList = employeeMapper.selectAllEmployee();
        employeeList.forEach(System.out::println);
    }

    @Test
    public void testGetEmployeeAndDeptById() throws IOException {
        EmployeeMapper employeeMapper = SqlSessionUtils.getSqlSession().getMapper(EmployeeMapper.class);
        System.out.println(employeeMapper.getEmployeeAndDeptById(2));
    }


    @Test
    public void getEmployeeAndDeptByStepOne() throws IOException {
        EmployeeMapper employeeMapper = SqlSessionUtils.getSqlSession().getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.getEmployeeAndDeptByStepOne(1);
        System.out.println(employee.getDepartment());
    }
}
