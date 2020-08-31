package com.munoz.models;

import java.util.ArrayList;

import com.munoz.services.UnoGameAPI;

public class Game {
	
	String gameName;
	
	public Game(String gameName) {
		super();
		this.gameName = gameName;
	}
	
	public Game() {
		super();
	}
	public String getGameName() {
		return gameName; 
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
		
}
