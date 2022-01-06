package com.pokedex.v2.controllers;

import com.pokedex.v2.proxy.PokemonProxy;
import com.pokedex.v2.sevices.PokedexService;
import com.pokedex.v2.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pokedex")
public class PokemonController {
    @Autowired
    private PokedexService pokedexService;

    @Autowired
    private PokemonProxy proxy;

    @GetMapping
    public Pokedex getPokedex(){
        return pokedexService.getPokedex().getBody();
    }

    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    public PokemonDetails getPokemonById (@PathVariable ("id")String id){
        return pokedexService.getPokemonById(id).getBody();}

}


