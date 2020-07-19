package br.com.estudo.transaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.config.EnableWebFlux;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;


@SpringBootApplication
@EnableWebFlux
@EnableSwagger2WebFlux
@EnableAutoConfiguration
@ComponentScan("br.com.estudo.transaction")
public class EstudoTransactionBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoTransactionBffApplication.class, args);
	}

}


