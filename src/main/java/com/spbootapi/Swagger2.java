package com.spbootapi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author yiji
 * @version v1.0.0
 * @date 2017/6/5 下午9:53
 * @Description
 * Swagger 配置
 * http://127.0.0.1:8899/swagger-ui.html
 */

@Configuration
@EnableSwagger2
public class Swagger2 {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.spbootapi.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpbootApi API")
                .description("代码仓库:https://github.com/jiyiren/SpbootApi")
                .termsOfServiceUrl("https://github.com/jiyiren/SpbootApi")
                .contact("jiyi")
                .version("1.0")
                .build();
    }
}
