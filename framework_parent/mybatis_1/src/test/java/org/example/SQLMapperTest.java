package org.example;

import org.example.entity.User;
import org.example.mapper.SQLMapper;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

public class SQLMapperTest {
    @Test
    public void testGetUserByUsername() throws Exception {
        SQLMapper sqlMapper = SqlSessionUtils.getSqlSession().getMapper(SQLMapper.class);
        System.out.println(sqlMapper.getUserByUserName("z"));
    }

    @Test
    public void testDeleteMore() throws Exception {
        SQLMapper sqlMapper = SqlSessionUtils.getSqlSession().getMapper(SQLMapper.class);
        int result = sqlMapper.deleleMore("1,2,3");
        System.out.println(result);
    }

    @Test
    public void testGetUserByTableName() throws Exception {
        SQLMapper sqlMapper = SqlSessionUtils.getSqlSession().getMapper(SQLMapper.class);
        System.out.println(sqlMapper.getUserByTableName("user"));
    }

    @Test
    public void testInsertUser() throws Exception {
        SQLMapper sqlMapper = SqlSessionUtils.getSqlSession().getMapper(SQLMapper.class);
        User user = new User("jjj", "123456");
        sqlMapper.insertUser(user);
        System.out.println(user);
    }

}
