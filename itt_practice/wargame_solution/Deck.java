package wargame_solution;

public class Deck {
	private static final int MIN_STRENGTH = 2;
	private static final int MAX_STRENGTH = 14;
	private static final int NUMBER_OF_SWAPS = 1000;
	public static final int NUMBER_OF_CARDS = 52;
	private Card[] cards = new Card[NUMBER_OF_CARDS];
	
	private int currentCardIndex = 0;

	public Deck() {
		generateCards();
		shuffleCards();
	}

	public Deck(Card[] cards) {
		int index = 0;
		for (Card card : cards) {
			this.cards[index++] = card;
		}
	}

	public Deck splitDeck(int start, int end) {
		if (start >= 0 && end < NUMBER_OF_CARDS && end >= start) {
			Card[] cards = new Card[end - start + 1];

			for (int index = start; index <= end; index++) {
				cards[index - start] = this.cards[index];
			}

			return new Deck(cards);
		}
		return new Deck();
	}
	
	public Card getNextCard() {
		if (currentCardIndex < NUMBER_OF_CARDS) {
			return this.cards[currentCardIndex++];
		}
		return null;
	}

	// shuffle cards
	private void shuffleCards() {
		for (int numberOfSwaps = 1; numberOfSwaps < NUMBER_OF_SWAPS; numberOfSwaps++) {
			int index = (int) (Math.random() * NUMBER_OF_CARDS);
			int index2 = (int) (Math.random() * NUMBER_OF_CARDS);
			Card temp = this.cards[index];
			this.cards[index] = this.cards[index2];
			this.cards[index2] = temp;
		}
	}

	// create cards
	private void generateCards() {
		final String[] strengths = { "J", "Q", "K", "A" };
		final String[] colors = { "Spades", "Diamonds", "Hearts", "Clubs" };
		int cardsCount = 0;

		for (int index = MIN_STRENGTH; index <= MAX_STRENGTH; index++) {
			for (int colorIndex = 0; colorIndex < colors.length; colorIndex++) {
				String strength = null;
				String color = colors[colorIndex];

				if (index <= MAX_STRENGTH - strengths.length) {
					strength = "" + index;
				} else {
					strength = strengths[index - 11];
				}

				Card card = new Card(color, strength, index);
				this.cards[cardsCount++] = card;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder("");
		
		if (this.cards != null) {
			for (Card card : this.cards) {
				if (card != null) {
					result.append(card);
					result.append("\n");
				}
			}
		}
		return result.toString();
	}

	public boolean hasCards() {
		return !(currentCardIndex >= NUMBER_OF_CARDS || 
				this.cards[currentCardIndex] == null);
	}
}
