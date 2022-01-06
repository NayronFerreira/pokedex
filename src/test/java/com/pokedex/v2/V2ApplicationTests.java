package com.pokedex.v2;

import com.pokedex.v2.model.Pokedex;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class V2ApplicationTests {

	@Test
	void consumindoPokedex() {

		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon?limit=200&offset=1", Pokedex.class);
		System.out.println(restTemplate);
	}

}
