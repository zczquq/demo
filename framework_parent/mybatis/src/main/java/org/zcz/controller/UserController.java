package org.zcz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zcz.entity.User;
import org.zcz.service.UserService;

import javax.annotation.Resource;

/**
 * @author 16339
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/save")
    public boolean save(User user) {
        return userService.save(user);
    }

    @GetMapping("/list")
    public Object list() {
        return userService.list();
    }
}
