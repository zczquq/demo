package org.zcz;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 16339
 */
@SpringBootApplication
@MapperScan("org.zcz.mapper")
@ImportResource({"classpath:application-context.xml","classpath:mybatis-config.xml"})
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
