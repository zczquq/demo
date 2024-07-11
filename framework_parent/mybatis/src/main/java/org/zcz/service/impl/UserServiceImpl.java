package org.zcz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zcz.entity.User;
import org.zcz.mapper.UserMapper;
import org.zcz.service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 16339
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public boolean save(User user) {
        int result = userMapper.insert(user);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<User> list() {
        return userMapper.getAllUser();
    }

}
