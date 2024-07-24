package org.example.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.mybatis.entity.Emp;
import org.example.mybatis.mapper.EmpMapper;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PageHelperTest {

    /**
     * limit index pageSize
     * index:当前页首行的索引
     * pageSize：每页的数据
     * pageNum：页码
     *
     * 实现分页：
     * 在查询功能之前开启分页功能
     */
    @Test
    public void testPageHelper() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
            // 开启分页
            Page<Object> page = PageHelper.startPage(4, 4);
            // 获取全部员工
            List<Emp> empList = empMapper.selectByExample(null);

            // new PageInfo<>(List list, int navigatePages);可以设置导航栏显示的页数
            PageInfo<Emp> pageInfo = new PageInfo<>(empList, 3);
            empList.forEach(System.out::println);
            System.out.println(pageInfo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
