package com.amit.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class SwaggerConfig {


    @Autowired
    private ApplicationConfig config;


    @Bean
    public OpenAPI customOpenAPI() {
        log.info("Application title: {} with version: {}", config.getTitle(), config.getVersion());

        return new OpenAPI()
                .info(
                        new Info()
                                .title(config.getTitle())
                                .description(config.getDescription())
                                .version(config.getVersion())
                                .termsOfService("http://swagger.io/terms/")
                                .license(
                                        new License()
                                                .name("Apache 2.0")
                                                .url("http://springdoc.org")
                                )

                );
    }

}
