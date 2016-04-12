package wargamecards;

public class Game {

	private static final int INIT_DECK_FIRST_INDEX = 0;
	private static final int MIN_CARD_NUM = 1;
	private static final int MAX_CARD_NUM = 52;
	
	
	
	Player player1;
	Player player2;
	protected static Card[] initDeck;
	
	public Game(){

	}
	
	public Game(Player p1, Player p2){
		this.player1 = p1;
		this.player2 = p2;
	}
	
	void play(){
		
		Player p1 = new Player("player 1");
		Player p2 = new Player("player 2");

		Game wargame = new Game(p1, p2);
		initDeck = new Card[MAX_CARD_NUM];
		wargame.initializeInitDeck();
		wargame.initializePlayerDecks();
		
		
		while(Player.lastDealedCardIndex != 0) {
			Card p1Card = this.player1.dealCard();
			Card p2Card = this.player2.dealCard();
			
			int comparisonResult = p1Card.compare(p2Card);
			
			switch(comparisonResult){
			case 1:
				this.player1.winCards(p1Card, p2Card);
				break;
			case 0:
				break;
			case -1: 
				this.player2.winCards(p1Card, p2Card);
				break;
			default:
				break;
			}
			
		}
	}
	
	public int randomNumInRange(int start, int end){
		return (int) (start + (Math.random() * (end - start)));
	}
	
	void initializeInitDeck(){
		for (int i = INIT_DECK_FIRST_INDEX; i < MAX_CARD_NUM; i++) {
			initDeck[i] = new Card(i);
		}
	}
	
	void initializePlayerDecks(){
		for (int i = 0; i < MAX_CARD_NUM / 2; i++) {
			this.player1.dealedCards[i] = initDeck[i];
		}
		
		int j = MAX_CARD_NUM / 2;
		for (int i = MAX_CARD_NUM / 2; i < MAX_CARD_NUM; i++) {
			this.player2.dealedCards[i - j] = initDeck[i];
		}
		
	}
	
	public static void main(String[] args) {
		
		new Game().play();
	    
		for (int i = 0; i < initDeck.length; i++) {
			System.out.println(initDeck[i]);
		}
		
		
		
	}
}
