package lesson24.task1_bank;

public class DepositAccount extends BankAccount {

	private double monthlyPayValue;
	
	public DepositAccount(double money, BankProduct deposit){
		super(money, deposit);
	}
}
