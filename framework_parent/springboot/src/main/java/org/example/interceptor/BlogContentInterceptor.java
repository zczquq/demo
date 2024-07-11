package org.example.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/**
 * @author 16339
 */
public class BlogContentInterceptor implements HandlerInterceptor {
    private static List<String> list = Arrays.asList("cnm");

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 假设content是字段发表的博客内容
        String content = request.getParameter("content");
        for (String s : list) {
            if (content.contains(s)) {

            }
        }
        return true;
    }
}
