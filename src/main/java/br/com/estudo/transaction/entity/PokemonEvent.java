package br.com.estudo.transaction.entity;

import lombok.*;

@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PokemonEvent {

    private Long eventId;
    private String eventType;

}
