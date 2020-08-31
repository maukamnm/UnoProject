package com.munoz.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import com.munoz.models.Game;
import com.munoz.models.Turn;
import com.munoz.services.UnoGameAPI;

@CrossOrigin(maxAge = 3600) // Allows cross origin request -- requests that dont come from home page

@RestController
public class GameController{
	
	
	@PostMapping("/games")
	Game postGame(@RequestBody Game game) {
		UnoGameAPI.getGame(game.getGameName());
		return new Game(game.getGameName());
		// Use the UnoGameAPI to
		// 1. Return the game name of an existing name
		// 2. Or create a new game and return its name
	} 

	@GetMapping("/games")
	List<Game> getGames() {
		
		String[] gamenames = UnoGameAPI.getGameNames();
		List<Game> games = new ArrayList<>();
		for(String name : gamenames) {
			games.add(new Game(name));
		}
		return games;
					
		// Use the UnoGameAPI to
		// 1. Get all existing game names
		// 2. This is a new method for the UnoGameAPI
	}

	@PutMapping("/games")
	Turn getTurn(@RequestBody Game game) {
		UnoGameAPI gameAPI = UnoGameAPI.getGame(game.getGameName());
		if(gameAPI != null && gameAPI.nextTurn()) {
			return gameAPI.getTurn();
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource!");
		
		// Use the UnoGameAPI to
		// 1. Get a game turn for the given game key (name)
		// 2. Do not create a game if the game key is unknown
		// 3. Instead, when game key is not known:
		// throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find
		// resource");
	}
}