package wargamecards;

public class Card extends Game {

	private int number;
	private int cardNumber;
	private int cardSuit;
	
	private boolean isValidNumber = number > 0 & number < 52;
	
	public Card(int number){
		setNumber(number);
		setCardNumber(number);
		setCardSuit(number);
	}
	
	int compare(Card p2Card){
		if (this.cardNumber > p2Card.cardNumber) {
			return 1;
		} 
		else {
			if(this.cardNumber < p2Card.cardNumber) {
				return -1;
			}
		}
		return 0;
	}
	
	public int getNumber() { return number; }

	public void setNumber(int number) { 
		this.number = (isValidNumber) ? number : 1;	
	}

	public int getCardNumber() { return cardNumber; }

	public void setCardNumber(int number) { 
		this.cardNumber = (isValidNumber) ? ( number + 3 ) / 4 : 1;  
	}

	public int getCardSuit() { return cardSuit; }

	public void setCardSuit(int number) { 
		this.cardSuit = (isValidNumber) ? number % 4 : 1;	
	}
	
	




	

	
}
