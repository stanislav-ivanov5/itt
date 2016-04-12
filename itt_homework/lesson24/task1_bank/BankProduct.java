package lesson24.task1_bank;

public class BankProduct {

	private static final int MAX_INTEREST = 100;
	private static final int MIN_INTEREST = 0;
	private static final int MIN_MONTHS = 0;
	private static final int MAX_MONTHS = 12;
	
	public String name;
	private double interest;
	private int periodOfMonths;
	
	
	public BankProduct(double interest){
		if(interest > MIN_INTEREST && interest <= MAX_INTEREST){
			this.interest = interest;
		}
	}
	
	void setPeriod(int months){
		if(months > MIN_MONTHS && months <= MAX_MONTHS){
			this.periodOfMonths = months;
		}
	}
	
	public int getPeriod(){
		return this.periodOfMonths;
	}
	
	public double getInterest() {
		return interest;
	}


}
