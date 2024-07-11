package org.zcz.beanconfig;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.zcz.mapper.UserMapper;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/**
 * @author 16339
 */
public class MybatisTest {

    @Test
    public void testMybatis() throws IOException {
        // 加载核心配置文件
        Reader is = Resources.getResourceAsReader("mybatis-config.xml");
        // 获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        int result = userMapper.insertUser();
        sqlSession.commit();
        System.out.println("result: " + result);
    }

    @Test
    public void testIO() {

    }
}
