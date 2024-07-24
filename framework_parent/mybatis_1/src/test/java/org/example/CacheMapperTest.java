package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.entity.Employee;
import org.example.mapper.CacheMapper;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.InputStream;

public class CacheMapperTest {

    /**
     * mybatis一级缓存失效的情况
     * 1.不同的sqlSession
     * 2.查询条件不同
     * 3.查询之间执行了增删改
     * 4.手动清空了缓存
     */

    /**
     * 测试一级缓存
     * @throws Exception
     */
    @Test
    public void testGetEmployee() throws Exception {
        // 一级缓存默认开启，sqlSession级别
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        CacheMapper cacheMapper = sqlSession.getMapper(CacheMapper.class);
        Employee employee1 = cacheMapper.getEmployeeById(1);
        System.out.println(employee1);
        // 清空一级缓存
        sqlSession.clearCache();
        Employee employee2 = cacheMapper.getEmployeeById(1);
        System.out.println(employee2);
    }

    @Test
    public void testGetEmployee2() throws Exception {
        // 一级缓存默认开启，sqlSession级别
        SqlSession sqlSession1 = SqlSessionUtils.getSqlSession();
        CacheMapper cacheMapper1 = sqlSession1.getMapper(CacheMapper.class);
        Employee employee1 = cacheMapper1.getEmployeeById(1);
        System.out.println(employee1);
        SqlSession sqlSession2 = SqlSessionUtils.getSqlSession();
        CacheMapper cacheMapper2 = sqlSession2.getMapper(CacheMapper.class);
        Employee employee2 = cacheMapper2.getEmployeeById(1);
        System.out.println(employee2);
    }

    /**
     * 测试二级缓存
     * 1.一级缓存sqlSession关闭或退出时，触发二级缓存
     * 2.在两个查询语句之间存在增删改时，二级缓存失效
     * @throws Exception
     */
    @Test
    public void testTwoCache() throws Exception {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        CacheMapper cacheMapper1 = sqlSession1.getMapper(CacheMapper.class);
        System.out.println(cacheMapper1.getEmployeeById(1));
        // cacheMapper1.deleteEmployeeById(16);
        sqlSession1.close();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        CacheMapper cacheMapper2 = sqlSession2.getMapper(CacheMapper.class);
        System.out.println(cacheMapper2.getEmployeeById(1));
    }
}
