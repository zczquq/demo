package org.example.study.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中的值映射到对象中
 * @ConfigurationProperties : 告诉springboot将本类中的所有属性和配置文件中相关的配置进行绑定
 *  只有这个组件是容器中的组件，才能使用容器中提供的@ConfigurationProperties功能
 *  启动类要开启@EnableConfigurationProperties注解以启用@ConfigurationProperties注解的支持
 *
 * @PropertySource可以导入一些与springboot无关的配置
 */
@Component
@Data
// @PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
public class Person {

    // @Value("${person.name}")
    private String name;

    // @Value("#{2*10}")
    private Integer age;

    // @Value("#{true}")
    private Boolean boss;

    // @Value("${person.birth}")
    private Date birth;

    private Map<String, Object> map;
    private List<Object> list;

    private Dog dog;
}
