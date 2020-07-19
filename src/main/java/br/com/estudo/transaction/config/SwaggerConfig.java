package br.com.estudo.transaction.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

import java.util.ArrayList;

@Configuration
@EnableSwagger2WebFlux
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
//                .paths(PathSelectors.ant("/v1/transactions/**"))
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        ApiInfo apiInfo = new ApiInfo("Estudos Transactions BFF",
                "API de transacoes",
                "1.0.0", ""
                , new Contact("Kaio Ferreira", "http://www.kaioferreira.blog.br", "kaioferreiracosta@hotmail.com"),
                "", "", new ArrayList<>()
        );
        return apiInfo;
    }


}