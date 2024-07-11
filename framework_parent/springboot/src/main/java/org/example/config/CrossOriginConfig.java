package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 16339
 */
@Configuration
public class CrossOriginConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 可以注册多组地址的跨域策略
        registry.addMapping("/**")
                // 配置的响应头
                // Access-Control-Allow-Methods
                .allowedMethods("*")
                // Access-Control-Allow-Origin
                .allowedOrigins("*")
                // Access-Control-Allow-Headers
                .allowedHeaders("*")
                // Access-Control-Expose-Headers
                .exposedHeaders("*");
    }
}
