package com.pokedex.v2.proxy;

import com.pokedex.v2.model.Pokedex;
import com.pokedex.v2.model.PokemonDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient (name = "pokedex" , url = "https://pokeapi.co/api/v2/pokemon?limit=200&offset=0")
public interface PokemonProxy {

	@GetMapping
	public Pokedex getPokedex ();

	@GetMapping (value = "/{id}")
	public PokemonDetails getPokemon (@PathVariable ("id")String id);
}
