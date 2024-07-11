package org.zcz.service;

import org.springframework.stereotype.Service;
import org.zcz.entity.User;

import java.util.List;

/**
 * 用户业务类
 * @author 16339
 */
public interface UserService {
    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean save(User user);

    List<User> list();
}
