package com.example.ToDoApp.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class APIConfig {

    @Bean
    public Docket TodoAPIDocumentation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfo("a","b","c","d",new Contact("name", "url", "m@gmail.com"),"Mainak Ghosh","Mainak license Url", Collections.emptyList()))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();

    }
}
