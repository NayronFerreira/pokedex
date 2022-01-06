package com.pokedex.v2.controllers;

import com.pokedex.v2.proxy.PokemonProxy;
import com.pokedex.v2.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pokedex")
public class PokemonController {

    @Autowired
    private PokemonProxy proxy;

    @GetMapping
    public Pokedex getPokedex(){
        return proxy.getPokedex();
    }

    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    public PokemonDetails getPokemonById (@PathVariable ("id")String id){
        return proxy.getPokemon(id);}

}


