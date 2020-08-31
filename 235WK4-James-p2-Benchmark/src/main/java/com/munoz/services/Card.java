package com.munoz.services;


public class Card {

	public Card(Color color, NumberValue numbervalue) {
		super();
		this.color = color;
		this.numbervalue = numbervalue;
	}
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public NumberValue getValue() {
		return numbervalue;
	}
	
	public boolean equals(Card card) {
		if (this.color == card.color || this.numbervalue == card.numbervalue) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Card [color=" + color + ", value=" + numbervalue + "]";
	}

	public Color color;
	public NumberValue numbervalue;

}
