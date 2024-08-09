package com.example.restfulcrud.controller;

import com.example.restfulcrud.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    /**
     * 异常处理
     * 此方法处理用户不存在异常
     * 但不能自适应显示，浏览器和客户端都只能返回json数据
     * @param e
     * @return
     */
    //@ResponseBody
    //@ExceptionHandler(UserNotExistException.class)
    //public Map<String, Object> exceptionHandler(Exception e) {
    //    HashMap<String, Object> map = new HashMap<>();
    //    map.put("code", "user.notexist");
    //    map.put("message", e.getMessage());
    //    return map;
    //}

    /**
     * 出现异常转发到/error页面，实现自适应相应效果
     * @param e
     * @return
     */
    @ExceptionHandler(UserNotExistException.class)
    public String exceptionHandler(Exception e, HttpServletRequest request) {
        //Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");
        // 传入自己的状态码
        request.setAttribute("javax.servlet.error.status_code", 500);
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", "user.notexist");
        map.put("message", e.getMessage());
        request.setAttribute("ext", map);
        return "forward:/error";
    }

}
