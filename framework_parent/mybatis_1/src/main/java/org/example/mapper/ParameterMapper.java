package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.entity.User;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    /**
     * 根据用户名查询用户
     * @param username
     * @return
     */
    List<User> getUserByUsername(String username);

    /**
     * 获取所有用户
     * @return
     */
    List<User> getAllUser();

    /**
     * 检查登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录
     * @param map
     * @return
     */
    User checkLoginMap(Map<String, Object> map);

    /**
     * 新增用户
     * @param user
     * @return
     */
    int insertUser(User user);

    /**
     * 使用@Param验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
