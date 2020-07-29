package br.com.estudo.transaction.repository;

import br.com.estudo.transaction.entity.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, String> {
}