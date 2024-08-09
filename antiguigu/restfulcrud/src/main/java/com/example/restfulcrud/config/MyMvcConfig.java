package com.example.restfulcrud.config;

import com.example.restfulcrud.component.LoginHandlerInterceptor;
import com.example.restfulcrud.component.MyLocaleResolver;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 使用WebMvcConfigurerAdapter可以扩展springMVC的功能则不能标注@EnableWbMvc
 * @EnableWebMvc可让espringMVC的自动配置失效，全部手动配置
 */
@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {



    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // super.addViewControllers(registry);
        // 浏览器发送/atguigu请求来到/home页面
        registry.addViewController("/atguigu").setViewName("/home");
    }

    // 所有的WebMvcConfigurerAdapter会一起起作用
    // 前提是将组件组测在容器中
    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                // 添加视图映射
                registry.addViewController("/").setViewName("/login");
                registry.addViewController("/login").setViewName("/login");
                registry.addViewController("/login.html").setViewName("/login");
                registry.addViewController("/main.html").setViewName("/dashboard");
            }

            /**
             * 注册拦截器
             * @param registry
             */
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                // springboot已经做好静态资源映射，不需要在排除静态资源
                //registry.addInterceptor(new LoginHandlerInterceptor())
                //        .addPathPatterns("/**")
                //        .excludePathPatterns("/login","/login.html","/user/login","/");
            }
        };

        return adapter;
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
