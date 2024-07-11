package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author 16339
 */
@SpringBootApplication
@MapperScan("org.example.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
