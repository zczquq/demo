package org.example.config;

import org.example.interceptor.BlackIpInterceptor;
import org.example.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 16339
 */
//@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 创建拦截器对象
        TokenInterceptor tokenInterceptor = new TokenInterceptor();
        // 注册拦截器对象，并指定拦截地址和排除地址，以及拦截器的执行顺序
        registry.addInterceptor(tokenInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/employee/hello", "/employee/hello03")
                .order(2);
        // 创建拦截器对象
        BlackIpInterceptor blackIpInterceptor = new BlackIpInterceptor();
    }

}
