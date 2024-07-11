package org.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 16339
 */
@Api(value = "用户接口",tags = {"用户接口"})
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value = "用户登录接口")
    @PostMapping("/login")
    public Object login(String username, String password) {
        return "success";
    }

    @ApiOperation(value = "用户注册接口")
    @PostMapping("/register")
    public Object register(String username, String password) {
        return "success";
    }
}
