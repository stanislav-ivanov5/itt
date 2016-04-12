package wargame_solution;

public class Game {
	private static final Player player1;
	private static final Player player2;
	
	static {
		Deck allCards = new Deck();
		Deck firstHalf = allCards.splitDeck(0, 5);
		Deck secondHalf = allCards.splitDeck(6, 11);
		
		player1 = new Player(firstHalf);
		player2 = new Player(secondHalf);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		while (player1.hasCards() && player2.hasCards()) {
			Card player1Card = player1.throwCard();
			Card player2Card = player2.throwCard();

			printPlayersCards(player1Card, player2Card);

			Thread.sleep(500);

			giveCardsToPlayer(player1Card, player2Card, 2);

			int warCounter = 2;
			while (player1Card.compareWith(player2Card) == 0 && player1.hasCards() && player2.hasCards()) {
				System.out.println("WAR!!!!");
				
				for(int count=1; count <= 3 && player1.hasCards() && player2.hasCards(); count++) {
					player1Card = player1.throwCard();
					player2Card = player2.throwCard();
					
					printPlayersCards(player1Card, player2Card);
					warCounter += 2;
				}
				
				giveCardsToPlayer(player1Card, player2Card, warCounter);
			}

			System.out.println();
		}

		printGameResult();
	}

	private static void printGameResult() {
		if (player1.getCardsTaken() > player2.getCardsTaken()) {
			System.out.println("Player 1 wins with takes : " + player1.getCardsTaken());
		} else {
			if (player1.getCardsTaken() < player2.getCardsTaken())
				System.out.println("Player 2 with takes : " + player2.getCardsTaken());
			else
				System.out.println("Draw.");
		}
	}

	private static void printPlayersCards(Card player1Card, Card player2Card) {
		System.out.println("Player 1 has thrown : " + player1Card);
		System.out.println("Player 2 has thrown : " + player2Card);
	}

	private static void giveCardsToPlayer(Card player1Card, Card player2Card, int warCounter) {
		// first player takes
		if (player1Card.compareWith(player2Card) > 0) {
			System.out.println("Player 1 takes.");
			player1.takeCards(warCounter);
		}
		
		//second player takes
		if (player1Card.compareWith(player2Card) < 0) {
			System.out.println("Player 2 takes.");
			player2.takeCards(warCounter);
		}
	}
}
