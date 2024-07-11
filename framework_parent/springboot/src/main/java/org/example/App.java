package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 启动类
 * @author 16339
 */
@SpringBootApplication
@MapperScan("org.example.mapper")
public class App {
    public static void main(String[] args) {
        // ConfigurationApplication即spring核心容器
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
//        System.out.println("获取容器内所有Bean的名字");
//        // 获取容器内所有Bean的名字，返回String数组
//        String[] names = context.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
//        System.out.println("IOC容器中Bean个数：" + names.length);
//        HikariDataSource dataSource = (HikariDataSource) context.getBean("dataSource");
//        ObjectMapper jacksonObjectMapper = (ObjectMapper) context.getBean("jacksonObjectMapper");
//        System.out.println(jacksonObjectMapper);
    }
}
