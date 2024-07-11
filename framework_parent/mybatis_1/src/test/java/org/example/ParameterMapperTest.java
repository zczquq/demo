package org.example;

import org.example.entity.User;
import org.example.mapper.ParameterMapper;
import org.example.mapper.UserMapper;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParameterMapperTest {

    /**
     * MyBatis获取参数值的两种方式：${} #{}
     * ${} 字符串拼接的方式，可导致sql注入安全问题
     * #{} 占位符赋值的方式
     * MyBatis获取参数值的各种情况
     * 1.mapper接口方法的参数为单个的字面量类型
     * 2.如果当前mapper接口参数为多个时
     * 3.若mapper接口方法的参数有多个时，可以手动将这些参数放在一个map中存储
     * 4.mapper接口方法的参数是一个实体类类型的参数,直接使用#{属性名}或者'${属性名}'属性的方式
     * 5.@param参数命名注解，命名参数
     */

    @Test
    public void testCheckLoginByParam() throws IOException {
        ParameterMapper parameterMapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);
        User user = parameterMapper.checkLoginByParam("张三", "123");
        System.out.println(user);
    }

    @Test
    public void testInsertUser() throws SQLException, IOException {
        UserMapper userMapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        User user = new User();
        userMapper.insertUser(null, "李四", "123456");
    }

    @Test
    public void testGetUserByUsername() throws IOException {
        ParameterMapper parameterMapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);
        List<User> userList = parameterMapper.getUserByUsername("zzz");
        userList.forEach(System.out::println);
    }

    @Test
    public void testCheckLogin() throws IOException {
        ParameterMapper parameterMapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);
        User user = parameterMapper.checkLogin("张三", "123");
        System.out.println(user);
    }

    @Test
    public void testCheckLoginMap() throws IOException {
        ParameterMapper parameterMapper = SqlSessionUtils.getSqlSession().getMapper(ParameterMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "zzz");
        map.put("password", "123456");
        User user = parameterMapper.checkLoginMap(map);
        System.out.println(user);
    }

    @Test
    public void testJDBC() throws Exception {
        String username = "admin";
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        // jdbc占位符拼接
        PreparedStatement ps = connection.prepareStatement("select * from user where username = ?");
        ps.setString(1, username);
    }

}
