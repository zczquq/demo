package org.example.mapper;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.example.entity.User;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /**
     * 根据用户id查询用户
     * @param id
     * @return
     */
    List<User> selectUserById(@Param("id") Integer id);

    List<User> getAllUser();

    /**
     * 查询总记录数
     * @return
     */
    Integer getCount();

    /**
     * 使用map接收实体类对象
     * @param id
     * @return
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 获取所有用户数据以map集合存储
     * 1.可以将所有map放在list中存储
     * 2.也可以利用@MapKey()注解，将数据的某一个唯一的字段值作为map的key存储，放在同一个map集合中
     * @return
     */
//    List<Map<String,Object>> getAllUserByMap();
    @MapKey("id")
    Map<String,Object> getAllUserByMap();
}
