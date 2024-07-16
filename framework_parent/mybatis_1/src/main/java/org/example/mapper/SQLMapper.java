package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.entity.User;

import java.util.List;

public interface SQLMapper {

    /**
     * 根据用户名模糊查询
     * @param userName
     * @return
     */
    List<User> getUserByUserName(@Param("username") String userName);

    /**
     * 批量删除用户
     * @param ids
     * @return
     */
    int deleleMore(@Param("ids") String ids);

    /**
     * 动态设置表名，查询所有用户信息
     * 查询指定表中的数据
     * @param tableName
     * @return
     */
    List<User> getUserByTableName(@Param("tableName") String tableName);

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    void insertUser(@Param("user") User user);



}
