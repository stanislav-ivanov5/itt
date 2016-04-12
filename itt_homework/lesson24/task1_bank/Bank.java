
package lesson24.task1_bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bank {

	private static final int SALARY_PORTION = 2;
	private static final int MIN_MONTHS = 0;
	private static final int MAX_MONTHS = 12;
	private static final int RESERVE_PERCERNT_OF_DEPOSIT = 90;
	private static final int MAX_PERCENT = 100;
	private final static String DEFAULT_NAME = "one";

	private List<BankProduct> products;
	private Map<Client, List<BankAccount>> accounts;

	private String name;
	private String address;

	private double bankReserveBalance;
	private double allDepositsAmount;

	public Bank(String name) {
		setName(name);
		products = new ArrayList<BankProduct>();
		accounts = new HashMap<Client, List<BankAccount>>();
	}

	public Set<Client> reviewClients() {
		if (accounts != null)
			return Collections.unmodifiableSet(accounts.keySet());
		return null;
	}

	void payAllDepositsInterest(){
		for(BankAccount account : ((Client)accounts.keySet()).getDeposits()){
			if(account instanceof DepositAccount){
				double addition = calculateInterest(account.getInterestRate(), account.getAccountBalance());
				account.addMoneyToAccount(addition);

				subtractMoneyAmount(addition);
				
			}
		}
	}
	
	public boolean giveCredit(Client client, double money, CreditProduct credit){
		boolean validArgs = client != null && money > 0;
		
		if(validArgs){
			
			double totalCreditPayments = 0;
			//calculate total monthly credit payments of client
			for(BankAccount cr : accounts.get(client)){
				if(cr instanceof CreditAccount){
					totalCreditPayments += ((CreditAccount)cr).getMonthlyPayValue();
				}
			}
			
			if(totalCreditPayments <= (client.getSalary() / (double)SALARY_PORTION)){
				CreditAccount newCredit = new CreditAccount(money, credit);
				this.addAccount(client, newCredit);
				this.subtractMoneyAmount(money);
				client.addMoney(money);
				client.addCredit(newCredit);
				return true;
			}
		}
		return false;
	}

	public double calculateInterest(double interest, double moneyAmount){
		return interest * moneyAmount;
	}
	
	public void addAccount(Client client, BankAccount account) {
		if (accounts != null & client != null & account != null) {
			List<BankAccount> list = new ArrayList<BankAccount>();

			if(!accounts.containsKey(client)){
				
				list.add(account);
				accounts.put(client, list);
			}
			else {
				accounts.get(client).add(account);
			}
		}
	}
	
	public void addDepositAmount(double money){
		if(money >= 0){
			this.allDepositsAmount += money;
			this.bankReserveBalance += ( ((double)RESERVE_PERCERNT_OF_DEPOSIT / (double)MAX_PERCENT) * money);
		}
	}
	
	public void subtractMoneyAmount(double money){
		if(money >= 0){
			this.allDepositsAmount -= money;
			this.bankReserveBalance -= ( ((double)RESERVE_PERCERNT_OF_DEPOSIT / (double)MAX_PERCENT) * money);
		}
	}

	public void addProduct(BankProduct product) {
		if (products != null & product != null) {
			products.add(product);
		}
	}
	
	public void printBalance(){
		System.out.println("Total deposit balance: " + this.allDepositsAmount);
		System.out.println("Bank reserve balance: " + this.bankReserveBalance);
	}

	private void setName(String newName) {
		this.name = (name != null) ? (this.name = newName) : DEFAULT_NAME;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		long temp;
		temp = Double.doubleToLongBits(allDepositsAmount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(bankReserveBalance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (Double.doubleToLongBits(allDepositsAmount) != Double.doubleToLongBits(other.allDepositsAmount))
			return false;
		if (Double.doubleToLongBits(bankReserveBalance) != Double.doubleToLongBits(other.bankReserveBalance))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}
}
