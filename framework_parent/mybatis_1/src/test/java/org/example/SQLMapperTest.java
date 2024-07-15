package org.example;

import org.example.mapper.SQLMapper;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

public class SQLMapperTest {
    @Test
    public void testGetUserByUsername() throws Exception {
        SQLMapper sqlMapper = SqlSessionUtils.getSqlSession().getMapper(SQLMapper.class);
        System.out.println(sqlMapper.getUserByUserName("z"));
    }
}
