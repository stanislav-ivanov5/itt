package wargamecards;

public class Player extends Game {

	static int lastDealedCardIndex = 26;

	private String name;
	Card[] dealedCards;
	Card[] wonCards; 
	
	private int wonCardsLastIndex = 0;
	
	public Player(String name){
		setName(name);
		this.dealedCards = new Card[26];
		this.wonCards = new Card[52];
	}
	
	public void shuffle(Card[] cards){
		
	}
	
	public Card  dealCard(){
		
		return null;
	}
	
	public void winCards(Card p1Card, Card p2Card){
		this.wonCards[getWonCardsLastIndex()] = p1Card;
		this.wonCards[getWonCardsLastIndex() + 1] = p2Card;
		setWonCardsLastIndex(getWonCardsLastIndex() + 2);
	}
	
	public String getName(){ return this.name; 	}
	
	public void setName(String name){
		this.name = (name != null) ? name : "";
	}

	public int getWonCardsLastIndex() {
		return wonCardsLastIndex;
	}

	public void setWonCardsLastIndex(int wonCardsLastIndex) {
		this.wonCardsLastIndex = wonCardsLastIndex;
	}
}
