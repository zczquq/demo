package org.example.interceptor;

import org.example.exception.CustomException;
import org.example.response.ResultEnum;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/**
 * @author 16339
 */
public class BlackIpInterceptor implements HandlerInterceptor {
    private static List<String> blackIpList = Arrays.asList("0:0:0:0:0:0:0:1");
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 取出请求报文中的客户端ip地址
        String remoteAddr = request.getRemoteAddr();
        System.out.println("---进入BlackIpInterceptor拦截器");
        System.out.println("客户端IP：" + remoteAddr);
        // 判断客户端Ip是否在blackIpList里
        if (blackIpList.contains(remoteAddr)) {
            throw new CustomException(ResultEnum.BLACK_IP);
        } else {
            return true;
        }
    }
}
