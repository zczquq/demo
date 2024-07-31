package org.example.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

/**
 * ImportResource导入自己编写的spring的配置文件，让配置配置文件里的内容生效
 */
// @ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
@EnableConfigurationProperties
public class Main {
    public static void main(String[] args) {
        // 传入springbootApplication标注的类
        SpringApplication.run(Main.class, args);
    }
}