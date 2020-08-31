package com.munoz.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import com.munoz.models.Turn;

public class UnoGameAPI {
	private int getNextPlayer(int player, boolean reverse) {
		if (!reverse) {
			player++;
			if (player > 3) {
				player = 0;
			}
		} else {
			player--;
			if (player == -1) {
	 			player = 3;
			}
		}
		return player;
	}
	int temp;
	Boolean winner = false;
	Deck deck = new Deck();
	public ArrayList<Card> discards = new ArrayList<>();
	ArrayList<Hand> hands = new ArrayList<Hand>();
	int player = 0;
	Card topCard;
	Card card;
	boolean reverse = false;
	
	static HashMap<String, UnoGameAPI> map = new HashMap<String, UnoGameAPI>();
	
	public static UnoGameAPI getGame(String gameName) {
		// check map to see if game is made, create if not.
		if (map.containsKey(gameName)) {
			return map.get(gameName);
		} else {
			UnoGameAPI unoGameApi = new UnoGameAPI();
			return map.put(gameName, unoGameApi);
		}
	}

	public static String [] getGameNames() {
		Set<String> keys = map.keySet();
		return keys.toArray(new String[0]);
	}
	public boolean nextTurn() {
		if (hands.get(player).CardCount() == 0) {
			winner = true;
			return false;
		} else {
			//player += getNextPlayer(player, reverse);
			return true;
		}
	}

	public Turn getTurn() {
		player = getNextPlayer(player, reverse);
		topCard = (discards.get(discards.size() - 1));
		card = hands.get(player).hasMatch(discards);
			
		if (topCard.getValue() == (NumberValue.REVERSE)) {
			reverse = true;
		}
		if (card != null) {
			if (topCard.getValue() == (NumberValue.SKIP)) {
				player = getNextPlayer(player, reverse);
			}
			if (topCard.getValue() == (NumberValue.REVERSE)) {
				reverse = !reverse;
			}
			if (topCard.getValue() == (NumberValue.WILDDRAWFOUR)) {
				temp = getNextPlayer(player, reverse);
				hands.get(temp).drawCard(deck.dealCard(discards));
				hands.get(temp).drawCard(deck.dealCard(discards));
				hands.get(temp).drawCard(deck.dealCard(discards));
				hands.get(temp).drawCard(deck.dealCard(discards));
			}
			if (topCard.getValue() == (NumberValue.DRAWTWO)) {
				temp = getNextPlayer(player, reverse);
				hands.get(temp).drawCard(deck.dealCard(discards));
				hands.get(temp).drawCard(deck.dealCard(discards));
			}

		} else { // Otherwise, draw a card and end the turn
			hands.get(player).drawCard(deck.dealCard(discards));
		}
		return new Turn(player, topCard, card, hands);
	}

	private UnoGameAPI() {
		deck.populate();
		deck.shuffle();
		hands.add(new Hand());
		hands.add(new Hand());
		hands.add(new Hand());
		hands.add(new Hand());

		for (int counter = 0; counter < 7; counter++) {
			for (Hand hand : hands) {
				hand.drawCard(deck.dealCard(discards)); // add discards to deck
			}
		}
		discards.add(deck.dealCard(discards));

	}
}
