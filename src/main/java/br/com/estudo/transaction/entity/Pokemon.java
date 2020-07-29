package br.com.estudo.transaction.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

    @Id
    private String id;

    private String nome;
    private String categoria;
    private String habilidades;
    private Double peso;
}