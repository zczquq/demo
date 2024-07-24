package org.example;

import org.example.entity.Employee;
import org.example.mapper.DynamicSQLMapper;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DynamicSQLTest {

    /**
     * 多条件查询 动态标签
     * 1.if：根据标签中的test属性所对应的表达式决定是否将标签中的内容拼接到SQL中
     * 2.where：会根据where标签中的if标签是否有内容 有则自动生成where，并将内容前多余的and或or给去除
     *          当where中没有内容时，不会生成where
     *          注意where标签不能将内容后的多余and给去除，不能再后面加and
     * 3.trim：功能更强大，可在生成的sql中添加前置和后置信息或清除指定的前置或后置信息
     *         prefix,suffix,prefixOverrides,suffixOverrides
     * 4.choose,when,otherwise，相当于if...else，所有when条件都不满足时，执行otherwise
     * 5.foreach标签遍历数组或集合
     *      collection：设置需要循环的数据和集合
     *      item：表示数组或集合中的每一个数据
     *      separator：循环体之间的分隔符
     *      open：foreach标签所循环的所有内容的开始符
     *      close：foreach标签所循环的所有内容的结束符
     * 6.sql标签
     *      定义sql片段：
     *          <sql id="empColumns">
     *              eid,emp_name,age,sex,email
     *          </sql>
     *      引用sql片段：
     *          <include refid="empColumns"/>
     */

    @Test
    public void testGetEmployeeByCondition() throws IOException {
        DynamicSQLMapper dynamicSQLMapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQLMapper.class);
        List<Employee> employees = dynamicSQLMapper.getEmployeeByCondition(new Employee(null, "张飞", 22, "男", "1231@qq.com"));
        System.out.println(employees);
    }

    @Test
    public void testGetEmployeeByConditionWhere() throws IOException {
        DynamicSQLMapper dynamicSQLMapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQLMapper.class);
        List<Employee> employees = dynamicSQLMapper.getEmployeeByConditionWhere(new Employee(null, null, 22, "男", "1231@qq.com"));
        System.out.println(employees);
    }

    @Test
    public void testGetEmployeeByConditionTrim() throws IOException {
        DynamicSQLMapper dynamicSQLMapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQLMapper.class);
        List<Employee> employees = dynamicSQLMapper.getEmployeeByConditionTrim(new Employee(null, null, 22, "男", null));
        System.out.println(employees);
    }

    @Test
    public void testGetEmployeeByChoose() throws IOException {
        DynamicSQLMapper dynamicSQLMapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQLMapper.class);
        // List<Employee> employees = dynamicSQLMapper.getEmployeeByChoose(new Employee(null, null, 22, "男", null));
        List<Employee> employees = dynamicSQLMapper.getEmployeeByChoose(new Employee(null, null, null, null, null));
        System.out.println(employees);
    }

    @Test
    public void testDeleteEmployeeByForeach() throws IOException {
        DynamicSQLMapper dynamicSQLMapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQLMapper.class);
        System.out.println(dynamicSQLMapper.deleteMoreByArray(new Integer[]{5, 6}));
    }

    @Test
    public void testInsertEmployeesByForeach() throws IOException {
        DynamicSQLMapper dynamicSQLMapper = SqlSessionUtils.getSqlSession().getMapper(DynamicSQLMapper.class);
        Employee emp1 = new Employee(null, "a1", 22, "男", "111@qq.com");
        Employee emp2 = new Employee(null, "a2", 26, "男", "111@qq.com");
        Employee emp3 = new Employee(null, "a3", 29, "男", "111@qq.com");
        Employee emp4 = new Employee(null, "a4", 23, "男", "111@qq.com");
        int result = dynamicSQLMapper.insertMoreByList(Arrays.asList(emp1, emp2, emp3, emp4));
        System.out.println(result);
    }
}
