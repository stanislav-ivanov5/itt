package lesson20_zadachi_bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String name;
	private String address;
	private List<Product> accounts;
	private double moneyAmount;
	private double bankReserve;
	private Client[] clients;
	
	public Bank(String name, String address, double moneyAmount){
		setName(name);
		setAddress(address);
		setMoneyAmount(moneyAmount);
		
		accounts = new ArrayList<>();
	}
	
	
	public void addProduct(Product product){
		boolean hasEmptyCells = false;
		for(Product p : accounts){
			if(p == null){
				hasEmptyCells = true;
				break;
			}
		}
		
		if(product != null && hasEmptyCells){
			accounts.add(product);
			System.out.println("add product");
		}
	}
	
	public void removeProduct(Product product){
		if(product != null){

			int index = accounts.indexOf(product);
			if(index >= 0 ){
				accounts.remove(index);
				System.out.println("remove product");
			}
		}
	}
	
	public void getDeposit(){
		
	}
	
	public void giveCredit(){
		
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
		if(money >= 0){
			this.moneyAmount += money;
		}
	}
	
	public void subtractMoney(double money){
		if(money >= 0){
			this.moneyAmount -= money;
		}
	}

	public void setMoneyAmount(double moneyAmount) {
		if(moneyAmount >= 0){
			this.moneyAmount = moneyAmount;
		}
	}

	public double getBankReserve() {
		return bankReserve;
	}

	public void setBankReserve() {
		if(this.moneyAmount >= 0){
			this.bankReserve = this.moneyAmount / 10;
		}
	}
	
	
}
