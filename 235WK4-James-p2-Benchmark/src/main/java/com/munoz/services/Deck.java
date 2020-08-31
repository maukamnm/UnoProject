package com.munoz.services;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	public ArrayList<Card> cards = new ArrayList<>();

	public Deck() {
		super();
	}

	public void populate() {

		cards.add(new Card(Color.RED, NumberValue.ZERO));
		cards.add(new Card(Color.RED, NumberValue.ONE));
		cards.add(new Card(Color.RED, NumberValue.TWO));
		cards.add(new Card(Color.RED, NumberValue.THREE));
		cards.add(new Card(Color.RED, NumberValue.FOUR));
		cards.add(new Card(Color.RED, NumberValue.FIVE));
		cards.add(new Card(Color.RED, NumberValue.SIX));
		cards.add(new Card(Color.RED, NumberValue.SEVEN));
		cards.add(new Card(Color.RED, NumberValue.EIGHT));
		cards.add(new Card(Color.RED, NumberValue.NINE));
		cards.add(new Card(Color.RED, NumberValue.SKIP));
		cards.add(new Card(Color.RED, NumberValue.REVERSE));
		cards.add(new Card(Color.RED, NumberValue.DRAWTWO));
		cards.add(new Card(Color.RED, NumberValue.ONE));
		cards.add(new Card(Color.RED, NumberValue.TWO));
		cards.add(new Card(Color.RED, NumberValue.THREE));
		cards.add(new Card(Color.RED, NumberValue.FOUR));
		cards.add(new Card(Color.RED, NumberValue.FIVE));
		cards.add(new Card(Color.RED, NumberValue.SIX));
		cards.add(new Card(Color.RED, NumberValue.SEVEN));
		cards.add(new Card(Color.RED, NumberValue.EIGHT));
		cards.add(new Card(Color.RED, NumberValue.NINE));
		cards.add(new Card(Color.RED, NumberValue.SKIP));
		cards.add(new Card(Color.RED, NumberValue.REVERSE));
		cards.add(new Card(Color.RED, NumberValue.DRAWTWO));

		cards.add(new Card(Color.YELLOW, NumberValue.ZERO));
		cards.add(new Card(Color.YELLOW, NumberValue.ONE));
		cards.add(new Card(Color.YELLOW, NumberValue.TWO));
		cards.add(new Card(Color.YELLOW, NumberValue.THREE));
		cards.add(new Card(Color.YELLOW, NumberValue.FOUR));
		cards.add(new Card(Color.YELLOW, NumberValue.FIVE));
		cards.add(new Card(Color.YELLOW, NumberValue.SIX));
		cards.add(new Card(Color.YELLOW, NumberValue.SEVEN));
		cards.add(new Card(Color.YELLOW, NumberValue.EIGHT));
		cards.add(new Card(Color.YELLOW, NumberValue.NINE));
		cards.add(new Card(Color.YELLOW, NumberValue.SKIP));
		cards.add(new Card(Color.YELLOW, NumberValue.REVERSE));
		cards.add(new Card(Color.YELLOW, NumberValue.DRAWTWO));
		cards.add(new Card(Color.YELLOW, NumberValue.ONE));
		cards.add(new Card(Color.YELLOW, NumberValue.TWO));
		cards.add(new Card(Color.YELLOW, NumberValue.THREE));
		cards.add(new Card(Color.YELLOW, NumberValue.FOUR));
		cards.add(new Card(Color.YELLOW, NumberValue.FIVE));
		cards.add(new Card(Color.YELLOW, NumberValue.SIX));
		cards.add(new Card(Color.YELLOW, NumberValue.SEVEN));
		cards.add(new Card(Color.YELLOW, NumberValue.EIGHT));
		cards.add(new Card(Color.YELLOW, NumberValue.NINE));
		cards.add(new Card(Color.YELLOW, NumberValue.SKIP));
		cards.add(new Card(Color.YELLOW, NumberValue.REVERSE));
		cards.add(new Card(Color.YELLOW, NumberValue.DRAWTWO));

		cards.add(new Card(Color.BLUE, NumberValue.ZERO));
		cards.add(new Card(Color.BLUE, NumberValue.ONE));
		cards.add(new Card(Color.BLUE, NumberValue.TWO));
		cards.add(new Card(Color.BLUE, NumberValue.THREE));
		cards.add(new Card(Color.BLUE, NumberValue.FOUR));
		cards.add(new Card(Color.BLUE, NumberValue.FIVE));
		cards.add(new Card(Color.BLUE, NumberValue.SIX));
		cards.add(new Card(Color.BLUE, NumberValue.SEVEN));
		cards.add(new Card(Color.BLUE, NumberValue.EIGHT));
		cards.add(new Card(Color.BLUE, NumberValue.NINE));
		cards.add(new Card(Color.BLUE, NumberValue.SKIP));
		cards.add(new Card(Color.BLUE, NumberValue.REVERSE));
		cards.add(new Card(Color.BLUE, NumberValue.DRAWTWO));
		cards.add(new Card(Color.BLUE, NumberValue.ONE));
		cards.add(new Card(Color.BLUE, NumberValue.TWO));
		cards.add(new Card(Color.BLUE, NumberValue.THREE));
		cards.add(new Card(Color.BLUE, NumberValue.FOUR));
		cards.add(new Card(Color.BLUE, NumberValue.FIVE));
		cards.add(new Card(Color.BLUE, NumberValue.SIX));
		cards.add(new Card(Color.BLUE, NumberValue.SEVEN));
		cards.add(new Card(Color.BLUE, NumberValue.EIGHT));
		cards.add(new Card(Color.BLUE, NumberValue.NINE));
		cards.add(new Card(Color.BLUE, NumberValue.SKIP));
		cards.add(new Card(Color.BLUE, NumberValue.REVERSE));
		cards.add(new Card(Color.BLUE, NumberValue.DRAWTWO));

		cards.add(new Card(Color.GREEN, NumberValue.ZERO));
		cards.add(new Card(Color.GREEN, NumberValue.ONE));
		cards.add(new Card(Color.GREEN, NumberValue.TWO));
		cards.add(new Card(Color.GREEN, NumberValue.THREE));
		cards.add(new Card(Color.GREEN, NumberValue.FOUR));
		cards.add(new Card(Color.GREEN, NumberValue.FIVE));
		cards.add(new Card(Color.GREEN, NumberValue.SIX));
		cards.add(new Card(Color.GREEN, NumberValue.SEVEN));
		cards.add(new Card(Color.GREEN, NumberValue.EIGHT));
		cards.add(new Card(Color.GREEN, NumberValue.NINE));
		cards.add(new Card(Color.GREEN, NumberValue.SKIP));
		cards.add(new Card(Color.GREEN, NumberValue.REVERSE));
		cards.add(new Card(Color.GREEN, NumberValue.DRAWTWO));
		cards.add(new Card(Color.GREEN, NumberValue.ONE));
		cards.add(new Card(Color.GREEN, NumberValue.TWO));
		cards.add(new Card(Color.GREEN, NumberValue.THREE));
		cards.add(new Card(Color.GREEN, NumberValue.FOUR));
		cards.add(new Card(Color.GREEN, NumberValue.FIVE));
		cards.add(new Card(Color.GREEN, NumberValue.SIX));
		cards.add(new Card(Color.GREEN, NumberValue.SEVEN));
		cards.add(new Card(Color.GREEN, NumberValue.EIGHT));
		cards.add(new Card(Color.GREEN, NumberValue.NINE));
		cards.add(new Card(Color.GREEN, NumberValue.SKIP));
		cards.add(new Card(Color.GREEN, NumberValue.REVERSE));
		cards.add(new Card(Color.GREEN, NumberValue.DRAWTWO));

		cards.add(new Card(Color.BLACK, NumberValue.WILD));
		cards.add(new Card(Color.BLACK, NumberValue.WILD));
		cards.add(new Card(Color.BLACK, NumberValue.WILD));
		cards.add(new Card(Color.BLACK, NumberValue.WILD));
		cards.add(new Card(Color.BLACK, NumberValue.WILDDRAWFOUR));
		cards.add(new Card(Color.BLACK, NumberValue.WILDDRAWFOUR));
		cards.add(new Card(Color.BLACK, NumberValue.WILDDRAWFOUR));
		cards.add(new Card(Color.BLACK, NumberValue.WILDDRAWFOUR));

	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card dealCard(ArrayList<Card> discards) {
		if (cards.size() == 0) {
			cards.addAll(discards);
			discards.clear();
			discards.add(cards.remove(cards.size() - 1)); 
		}
		int index = (cards.size() - 1);
		if(index < 0) {
			System.out.println("Negative");
		}
		return cards.remove(cards.size() - 1);
		
	}

	@Override
	public String toString() {
		return "Deck [deck =" + cards + "]";

	}
}
