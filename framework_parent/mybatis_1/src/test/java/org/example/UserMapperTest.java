package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.User;
import org.example.mapper.ParameterMapper;
import org.example.mapper.UserMapper;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

/**
 * @author 16339
 */
public class UserMapperTest {


    public SqlSession getSqlSession() throws IOException {
        // 加载核心配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        Reader reader = new InputStreamReader(resourceAsStream);
        // 获取sqlSessionFactoryBuilder,获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        // 创建sqlSession对象，此时通过sqlSession操作的sql都必须手动提交或手动回滚
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 自动提交事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        return sqlSession;
    }

    @Test
    public void testInsertUser() throws IOException {
        User user = new User();
        user.setUsername("zzz");
        user.setPassword("1123");
//        // 加载核心配置文件
//        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
//        // 获取sqlSessionFactoryBuilder,获取sqlSessionFactory
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        // 创建sqlSession对象，此时通过sqlSession操作的sql都必须手动提交或手动回滚
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        // 通过代理模式创建userMapper接口的代理实现类对象
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        SqlSession sqlSession = getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        int result = userMapper.insertUser();
//        sqlSession.commit();
//        System.out.println(result);
    }

    @Test
    public void testUpdateUser() throws IOException {
        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
        userMapper.updateUser();
    }

    @Test
    public void testDeleteUser() throws IOException {
        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
        userMapper.deleteUser();
    }

    @Test
    public void testSelectUserById() throws IOException {
        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
        User user = userMapper.selectUserById();
        System.out.println(user);
    }

    @Test
    public void testSelectAllUser() throws IOException {
        UserMapper userMapper = getSqlSession().getMapper(UserMapper.class);
        List<User> userList = userMapper.selectAllUser();
        System.out.println(userList);
    }

    @Test
    public void testGetAllUser() throws IOException {
        UserMapper userMapper = SqlSessionUtils.getSqlSession().getMapper(UserMapper.class);
        List<User> allUsers = userMapper.selectAllUser();
        allUsers.forEach(user -> System.out.println(user));
    }


}
