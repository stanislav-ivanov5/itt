package wargame_solution;

public class Card {
	private final String color;
	private final String strength;
	private final int cardPower;
	
	public Card(String color, String strength, int cardPower) {
		this.color = color;
		this.strength = strength;
		this.cardPower = cardPower;
	}
	
	public int compareWith(Card otherCard) {
		return this.cardPower - otherCard.cardPower;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public String getStrength() {
		return strength;
	}
	
	@Override
	public String toString() {
		return this.strength + " " + this.color;
	}
}
