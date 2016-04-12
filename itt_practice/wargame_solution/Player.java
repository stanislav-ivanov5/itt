package wargame_solution;

public class Player {
	private Deck deck;
	private int cardsTaken = 0;

	public Player(Deck deck) {
		this.deck = deck;
	}
	
	public Card throwCard() {
		return deck.getNextCard();
	}

	public boolean hasCards() {
		return deck.hasCards();
	}
	
	public void takeCards(int number) {
		if (number > 0) {
			cardsTaken += number;
		}
	}

	public int getCardsTaken() {
		return cardsTaken;
	}
}
