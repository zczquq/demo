package org.example.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * @auther 1633
 */
public class SqlSessionUtils {

    public static SqlSession getSqlSession() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        Reader reader = new InputStreamReader(resourceAsStream);
        // 获取sqlSessionFactoryBuilder,获取sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        // 创建sqlSession对象，此时通过sqlSession操作的sql都必须手动提交或手动回滚
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 自动提交事务
        return sqlSessionFactory.openSession(true);
    }
}
