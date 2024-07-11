package org.example.mapper;

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

    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);
}
