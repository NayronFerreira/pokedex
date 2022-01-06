package com.pokedex.v2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PokemonDetails {
    private String name;
    private Integer base_experience;
    private Integer height;
    private Integer weight;
    @Autowired
    private List<Forms> forms;
    @Autowired
    private PokemonImagens sprites;
    @Autowired
    private List<Object> moves;
}
