package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 所有的Bean全部默认以单例模式实现
 * @Scope("sington")
 * @author 16339
 */
@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/detail/{id}/{username}")
    public Object detail(@PathVariable("id")Integer id, @PathVariable("username")String username) {
        return "id:" + id + " username:" + username;
    }


    @Value("${my.list}")
    private List<String> list = new ArrayList<>();

    @GetMapping("/getList")
    public Object testList() {
        return list;
    }

    IHelloService helloService;


    public HelloController() {
        System.out.println("对象被创建");
    }

    /**
     * 构造方法注入
     */
    @Autowired
    public HelloController(IHelloService helloService) {
        this.helloService = helloService;
    }

    /**
     * set方法注入
     * @param helloService
     */
    public void setHelloService(IHelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/m1")
    public Object m1(HttpServletRequest request) {
        log.trace("进入m1接口，打印trace级别日志");
        log.debug("进入m1接口，打印debug级别日志");
        log.info("进入m1接口，打印info级别日志");
        log.warn("进入m1接口，打印warn级别日志");
        log.error("进入m1接口，打印error级别日志");
        return "m1";
    }

    @GetMapping("/m2")
    public Object m2(HttpServletRequest request) {
        return "m2";
    }

    @GetMapping("/m3")
    public Object m3(HttpServletRequest request) {
        return "m3";
    }

    @GetMapping("/m4")
    public Object m4(HttpServletRequest request) {
        return new HashMap<String, Object>();
    }
}
