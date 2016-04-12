package lesson20_zadachi_bank;

public abstract class Product {
	
	private String name;
	private double interestRate;
	private int period;
	private double moneyAmount;
	
	
	public Product(String name, double interestRate, int period){
		setName(name);
		setInterestRate(interestRate);
		setPeriod(period);
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null){
			this.name = name;
		}
	}


	public int getPeriod() {
		return period;
	}


	public void setPeriod(int period) {
		if(period >= 1 && period <= 60){
			this.period = period;
		}
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		if(interestRate >= 1){
			this.interestRate = interestRate;
		}
	}


	public double getMoneyAmount() {
		return moneyAmount;
	}


	public void setMoneyAmount(double moneyAmount) {
		if(moneyAmount >= 0){
			this.moneyAmount = moneyAmount;
		}
	}
	
	
	
	
}
