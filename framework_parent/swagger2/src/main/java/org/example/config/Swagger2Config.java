package org.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author 16339
 */
@Configuration
public class Swagger2Config {
    /**
     * 用于返回一个Docket对象，是Swagger2的核心对象
     * @Bean 专门用于配置类中将方法返回的对象注入到IOC容器中
     * @return
     */
    @Bean
    public Docket createDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                // 指定控制器在哪个包
                .apis(RequestHandlerSelectors.basePackage("org.example.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                // 设置设置文档标题
                .title("Java审批系统接口文档")
                // 文档描述
                .description("接口说明")
//                // 服务条款URL
//                .termsOfServiceUrl("/api/doc")
                // 作者信息
                .contact(new Contact("作者名","作者的网站", "作者的邮箱"))
                // 版本号
                .version("1.0.0")
                .build();
    }
}
