package lesson24.task1_bank;

public abstract class BankAccount {

	private static final int MIN_MONEY = 0;
	private String name;
	private int monthsPeriod;
	private static int currentID;
	private int id;
	
	private double interestRate;
	private double accountBalance;
	

	public BankAccount(double money, BankProduct bankProduct){
		addMoneyToAccount(money);
		setAccountDimensions(bankProduct);
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void addMoneyToAccount(double money){
		if(money >= MIN_MONEY){
			this.accountBalance += money;
		}
	}
	
	private void setAccountDimensions(BankProduct product){
		if(product != null){
			if(product.getPeriod() != 0){
				this.interestRate = product.getInterest();
				this.monthsPeriod = product.getPeriod();
			}
		}
	}
	
}
