package org.example.study.config;

import org.example.study.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration: 指明当前类是一个配置类，替代之前的Spring配置文件
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService getHelloService() {
        System.out.println("添加组件");
        return new HelloService();
    }

}
