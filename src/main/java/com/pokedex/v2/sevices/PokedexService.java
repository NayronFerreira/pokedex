package com.pokedex.v2.sevices;

import com.pokedex.v2.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
@Service
public class PokedexService {
    @Autowired
    RestTemplate restTemplate = new RestTemplate();

    public ResponseEntity<Pokedex> getPokedex (){
        return restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon?limit=200&offset=0", Pokedex.class);
    }
    public ResponseEntity<PokemonDetails> getPokemonById (@PathVariable ("id") String id){
        return restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon/"+id, PokemonDetails.class);
    }

}
