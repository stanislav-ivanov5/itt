package lesson20_zadachi_bank;

public class Client {

	private String name;
	private String address;
	private double moneyAmount;
	private double monthlySalary;
	private Deposit deposit;
	private Credit credit;
	
	public Client(String name, String address, double money, double salary){
		setName(name);
		setAddress(address);
		setMoneyAmount(money);
		setMonthlySalary(salary);
		
		
		
	}

	
	
	public void createDeposit(double money, int period){
	}
	
	public void askForCredit(){
		
	}
	
	public void creditPayment(){
		
	}
	
	public Deposit getDeposit() {
		return this.deposit;
	}



	public void setDeposits(Deposit deposit) {
		if(deposit != null){
			this.deposit = deposit;
		}
	}



	public Credit getCredits() {
		return this.credit;
	}



	public void setCredits(Credit credit) {
		if(credit != null){
			this.credit = credit;
		}
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null){
			this.name = name;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if(address != null){
			this.address = address;
		}
	}

	public double getMoneyAmount() {
		return moneyAmount;
	}

	public void addMoney(double money){
		if(money >= 0 ){
			this.moneyAmount += money;
		}
	}
	
	public void subtractMoney(double money){
		if(money >= 0 ){
			this.moneyAmount -= money;
		}
	}
	
	public void setMoneyAmount(double moneyAmount) {
		if(moneyAmount >= 0){ 
			this.moneyAmount = moneyAmount;
		}
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	
}
