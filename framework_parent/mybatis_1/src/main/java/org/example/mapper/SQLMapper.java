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
}
