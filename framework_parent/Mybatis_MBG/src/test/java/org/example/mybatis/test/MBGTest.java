package org.example.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mybatis.entity.Emp;
import org.example.mybatis.entity.EmpExample;
import org.example.mybatis.mapper.EmpMapper;
import org.example.mybatis.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MBGTest {
    @Test
    public void testMBG() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            // 设置自动提交事务
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
            // 查询所有数据
            // List<Emp> empList = empMapper.selectByExample(null);
            // empList.forEach(System.out::println);
            // 条件查询
            EmpExample empExample = new EmpExample();
            empExample.createCriteria().andEmpNameEqualTo("a2");
            empExample.or().andAgeGreaterThanOrEqualTo(24);
            List<Emp> empList = empMapper.selectByExample(empExample);
            empList.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void testUpdate() {
        try {
            EmpMapper empMapper = SqlSessionUtils.getSqlSession().getMapper(EmpMapper.class);
            empMapper.updateByPrimaryKeySelective(new Emp(1,"admin",null,null,null,null));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
