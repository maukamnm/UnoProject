package com.munoz.models;

import java.util.ArrayList;

import com.munoz.services.Card;
import com.munoz.services.Hand;

public class Turn {
//has all information for the U/I to show results
	// has information regarding UI, like it needs topcard but not discard deck
	private int player = 0;
	Card topCard;
	Card card;
	private boolean winner;
	ArrayList<Hand> hands = new ArrayList<Hand>();

	public Turn(int player, Card topCard, Card card, ArrayList<Hand> hands) {
		super();
		this.player = player;
		this.topCard = topCard;
		this.card = card;
		this.hands = hands;
	}

	public ArrayList<Hand> getHands() {
		return hands;
	}

	public int getPlayer() {
		return player;
	}

	public Card getTopCard() {
		return topCard;
	}

	public Card getCard() {
		return card;
	}

	public boolean isWinner() {
		return winner;
	}
}