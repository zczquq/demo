package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.entity.User;

import java.util.List;

/**
 * @author 16339
 */
public interface UserMapper {
    /**
     * 添加用户
     * @return
     */
    int insertUser(Integer id, String name, String password);

    /**
     * 修改用户信息
     * @return
     */
     void updateUser();

    /**
     * 删除用户（真删除）
     * @return
     */
    int deleteUser();

    /**
     * 查询用户id
     * @return
     */
    User selectUserById();

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAllUser();

}
