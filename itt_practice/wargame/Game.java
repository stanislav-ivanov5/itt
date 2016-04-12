package wargame;

public class Game {
	
	public static final int NUMBER_CARDS_DECK = 52;
	private static final int ADDITIONAL_CARDS = 3;

	Card[] playerOne;
	Card[] playerTwo;
	
	public Game(){
		
	}
	
	public static void main(String[] args){
		Card[] entireDeck = createDeck();
		Card[] shuffledDeck = shuffleDeck(entireDeck);

		Card[] playerOne = new Card[NUMBER_CARDS_DECK];
		Card[] playerTwo = new Card[NUMBER_CARDS_DECK];

		for (int i= 0; i < NUMBER_CARDS_DECK; i++) {
			if (i % 2 == 0) {
				playerOne[i / 2] = shuffledDeck[i];
			}
			else
			{
				playerTwo[i / 2] = shuffledDeck[i];
			}
		}

		while (hasCards(playerOne) && hasCards(playerTwo)) {
			System.out.println("Player one has " + countCards(playerOne) + " card and player two has " +
					+ countCards(playerTwo) + " cards.");

			playRound(playerOne, playerTwo);

			System.out.println("\n");
		}

		if (hasCards(playerOne)) {
			System.out.println("Player one won!");
		}
		else {
			System.out.println("Player two won!");
		}
	} // end main
	

	private static Card[] createDeck() {
		Card[] entireDeck = new Card[NUMBER_CARDS_DECK];
		
		for (int i = 0; i < NUMBER_CARDS_DECK; i++) {
			entireDeck[i] = new Card();
			entireDeck[i].setSuit(i / 13);
			entireDeck[i].setNumber(i % 13 +1);
		}

		return entireDeck;
	}


	private static Card[] shuffleDeck(Card[] deck) {
		final int NUMBER_SWAPS = 100;
		
		java.util.Random generator = new java.util.Random();

		for (int i = 0; i < NUMBER_SWAPS; i++) {
			int index1 = generator.nextInt(NUMBER_CARDS_DECK);
			int index2 = generator.nextInt(NUMBER_CARDS_DECK);

			Card temporaryCard = deck[index1];
			deck[index1] = deck[index2];
			deck[index2] = temporaryCard;
		}		

		return deck;
	}

	private static void playRound(Card[] deck1, Card[] deck2) {

		Card[] pile = new Card[NUMBER_CARDS_DECK];

		Card playerOneCard = deck1[0];
		Card playerTwoCard = deck2[0];		
		
		removeTopCard(deck1);
		addCardToBottom(pile, playerOneCard);
		removeTopCard(deck2);
		addCardToBottom(pile, playerTwoCard);

		int comparison = compareCards(playerOneCard, playerTwoCard);
		printRoundResults(playerOneCard, playerTwoCard);

		while (comparison == 0) {

			for (int j = 0; j < ADDITIONAL_CARDS; j++) {
				if (!hasCards(deck1) || !hasCards(deck2)) {
					return;
				}

				addCardToBottom(pile, deck1[0]);
				addCardToBottom(pile, deck2[0]);
				removeTopCard(deck1);
				removeTopCard(deck2);
			}
			
			if (!hasCards(deck1) || !hasCards(deck2)) {
				return;
			}

			playerOneCard = deck1[0];
			playerTwoCard = deck2[0];		
		
			removeTopCard(deck1);
			addCardToBottom(pile, playerOneCard);
			removeTopCard(deck2);
			addCardToBottom(pile, playerTwoCard);

			comparison = compareCards(playerOneCard, playerTwoCard);
			printRoundResults(playerOneCard, playerTwoCard);
		}

		
		if (comparison > 0) {
			while (hasCards(pile)) {
				addCardToBottom(deck1, pile[0]);
				removeTopCard(pile);
			}
		}
		else if (comparison < 0) {
			while (hasCards(pile)) {
				addCardToBottom(deck2, pile[0]);
				removeTopCard(pile);
			}
		}
	}

	private static void printRoundResults(Card playerOneCard, Card playerTwoCard) {
		System.out.println("Player one plays " + playerOneCard.getNumber());
		System.out.println("Player two plays " + playerTwoCard.getNumber());

		int comparison = compareCards(playerOneCard, playerTwoCard);

		if (comparison == 0) {
			System.out.println("equal");
		}
		else if (comparison > 0) {
			System.out.println("Player one wins that round!");
		}
		else {
			System.out.println("Player two wins that round!");
		}
	}

	private static void removeTopCard(Card[] deck)
	{
		for (int i = 0; i < deck.length - 1; i++) {
			deck[i] = deck[i + 1];
		}
	}

	private static void addCardToBottom(Card[] deck, Card newCard)
	{
		for (int i = 0; i < deck.length; i++) {
			if (deck[i] == null) {
				deck[i] = newCard;
				return;
			}
		}
	}

	private static int compareCards(Card card1, Card card2) {
		int playerOneNumber = card1.getNumber();
		int playerTwoNumber = card2.getNumber();

		if (playerOneNumber == playerTwoNumber) {
			return 0;
		}	
		if (playerOneNumber == 1) {
			return 1;
		}
		if (playerTwoNumber == 1) {
			return 1;
		}
		if (playerTwoNumber > playerOneNumber) {
			return -1;
		}
		else {
			return 1;
		}
	}

	private static boolean hasCards(Card[] deck) {
		for (int i=0; i < deck.length; i++) {
			if (deck[i] != null) {
				return true;
			}
		}

		return false;
	}

	private static int countCards(Card[] deck) {
		int total = 0;
		for (int i=0; i < deck.length; i++) {
			if (deck[i] != null) {
				total++;
			}
		}

		return total;
	}
}