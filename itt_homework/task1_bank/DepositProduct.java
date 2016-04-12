package lesson24.task1_bank;

public class DepositProduct extends BankProduct {

	private static final String DEFAULT_NAME = "deposit";
	private static final int MIN_MONTHS = 0;
	private static final int MAX_MONTHS = 12;
	private static final int MAX_INTEREST_RATE = 100;
	private static final int MIN_INTEREST_RATE = 0;

	private int periodOfMonths;
	
	public DepositProduct(double interest, int months, String name){
		super(interest);
		this.setPeriod(months);
		setName(name);
	}

	
	private void setName(String newName){
		this.name = (name != null) ? ( this.name = newName ) : DEFAULT_NAME ;
		
	}
}
