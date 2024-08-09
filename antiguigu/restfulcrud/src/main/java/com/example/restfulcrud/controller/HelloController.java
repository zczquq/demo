package com.example.restfulcrud.controller;

import com.example.restfulcrud.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        if (user.equals("aaa")) {
            throw new UserNotExistException();
        }
        return "Hello World";
    }

    @RequestMapping("/home")
    public String success(Map<String,Object> map) {
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("shanghai","nanjing","beijing"));
        return "home";
    }
}
