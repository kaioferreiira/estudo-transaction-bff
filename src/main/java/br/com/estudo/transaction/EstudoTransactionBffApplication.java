package br.com.estudo.transaction;


import br.com.estudo.transaction.entity.Pokemon;
import br.com.estudo.transaction.repository.PokemonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.web.reactive.config.EnableWebFlux;
import reactor.core.publisher.Flux;
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

	@Bean
	CommandLineRunner init (ReactiveMongoOperations operations, PokemonRepository repository) {
		return args -> {
			Flux<Pokemon> pokemonFlux = Flux.just(
					new Pokemon(null, "Bulbassauro", "Semente", "OverGrow", 6.09),
					new Pokemon(null, "Charizard", "Fogo", "Blaze", 90.05),
					new Pokemon(null, "Caterpie", "Minhoca", "Poeira do Escudo", 2.09),
					new Pokemon(null, "Blastoise", "Marisco", "Torrente", 6.09))
					.flatMap(repository::save);

			pokemonFlux
					.thenMany(repository.findAll())
					.subscribe(System.out::println);
		};
	}
}


