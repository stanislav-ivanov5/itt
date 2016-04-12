package lesson24.task1_bank;

public class CreditAccount extends BankAccount {

	private static final int PERCENTS = 100;
	
	private double montlyPayValue;

	public CreditAccount(double money, CreditProduct credit) {
		super(money, credit);
		
		if(credit != null){
			
			this.montlyPayValue = (this.getAccountBalance() * 
					(PERCENTS + this.getInterestRate())) / credit.getPeriod();
		}
	}

	
	public double getMonthlyPayValue(){
		return this.montlyPayValue;
	}
}
