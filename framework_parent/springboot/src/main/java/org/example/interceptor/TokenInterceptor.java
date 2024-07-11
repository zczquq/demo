package org.example.interceptor;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.example.exception.CustomException;
import org.example.response.ResultEnum;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 16339
 */
public class TokenInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 从请求报文的头部取出token令牌（假设token头部字段为Auth)
        String token = request.getHeader("Auth");
        System.out.println("进入拦截器");
        System.out.println("token:" + token);
        if (StringUtils.hasText(token)) {
            return true;
        } else {
            throw new CustomException(ResultEnum.INVALID_TOKEN);
        }
    }
}
