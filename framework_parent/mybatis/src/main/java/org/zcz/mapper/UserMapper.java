package org.zcz.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zcz.entity.User;

import java.util.List;

/**
 * @author 16339
 */
public interface UserMapper {
    int insertUser();

    int insert(User user);
    int delete(User user);

    List<User> getAllUser();
}
