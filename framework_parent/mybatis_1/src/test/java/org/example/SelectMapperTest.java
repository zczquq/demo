package org.example;

import org.example.entity.User;
import org.example.mapper.SelectMapper;
import org.example.utils.SqlSessionUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class SelectMapperTest {

    /**
     * mybatis的各种查询功能
     * 1.若查询的数据只有一条，可以用对象来接收
     * 2.若查询的数据有多条，一定不能用对象来接收
     *      1）可以通过实体类类型的list接收
     *      2）也可以通过map集合接收
     *      3）@MapKey注解可以将一个字段值作为map的键
     */

    /**
     *
     * @throws IOException
     */
    @Test
    public void testSelectMapper() throws IOException {
        SelectMapper selectMapper = SqlSessionUtils.getSqlSession().getMapper(SelectMapper.class);
        System.out.println(selectMapper.selectUserById(1));
    }

    @Test
    public void testGetAllUser() throws IOException {
        SelectMapper selectMapper = SqlSessionUtils.getSqlSession().getMapper(SelectMapper.class);
        List<User> allUser = selectMapper.getAllUser();
        allUser.forEach(System.out::println);
    }

    @Test
    public void testGetCountUser() throws IOException {
        SelectMapper selectMapper = SqlSessionUtils.getSqlSession().getMapper(SelectMapper.class);
        System.out.println(selectMapper.getCount());
    }

    @Test
    public void testGetUserByIdToMap() throws IOException {
        SelectMapper selectMapper = SqlSessionUtils.getSqlSession().getMapper(SelectMapper.class);
        System.out.println(selectMapper.getUserByIdToMap(1));
    }

    @Test
    public void testGetAllUserByMap() throws IOException {
        SelectMapper selectMapper = SqlSessionUtils.getSqlSession().getMapper(SelectMapper.class);
        System.out.println(selectMapper.getAllUserByMap());
    }
}
