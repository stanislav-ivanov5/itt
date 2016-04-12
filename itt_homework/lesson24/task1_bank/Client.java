package lesson24.task1_bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

	private static final int ZERO = 0;
	private List<DepositAccount> deposits;
	private List<CreditAccount> credits;

	private String name;
	private String address;

	private double moneyBalance;

	private double salary;

	public Client(String name, double moneyBalance, double salary) {
		setName(name);
		setMoneyBalance(moneyBalance);
		setSalary(salary);
		deposits = new ArrayList<DepositAccount>();
		credits = new ArrayList<CreditAccount>();
	}

	public void openDeposit(Bank bank, double money, BankProduct depositProduct) {
		if (bank != null & depositProduct != null & this.moneyBalance > 0) {
			if (money >= ZERO) {
				DepositAccount newDeposit = new DepositAccount(money, depositProduct);
				deposits.add(newDeposit);
				bank.addAccount(this, newDeposit);

				this.subtractMoney(money);
				bank.addDepositAmount(money);
			}
		}
	}

	public void addCredit(CreditAccount credit) {
		if (credit != null) {
			credits.add(credit);
		}
	}

	public void askForCredit(Bank bank, double money, CreditProduct credit) {
		System.out.println(this.getName() + " ask for a credit");

		if (bank.giveCredit(this, money, credit)) {
			System.out.println(this.getName() + " gets credit for " + money + " lv");
		} else {
			System.out.println(this.getName() + "doesn't get credit for " + money + " lv");
		}
	}

	private String getName() {
		return this.name;
	}

	public List<DepositAccount> getDeposits() {
		return (List<DepositAccount>) Collections.unmodifiableCollection(deposits);
	}

	public double getMoneyBalance() {
		return moneyBalance;
	}

	private void setName(String newName) {
		if (newName != null) {
			this.name = newName;
		}
	}

	private void setMoneyBalance(double newMoneyBalance) {
		this.moneyBalance = newMoneyBalance;
	}

	public void setSalary(double salary) {
		if (salary > ZERO) {
			this.salary = salary;
		}
	}

	public void addMoney(double money) {
		if (money >= ZERO) {
			this.moneyBalance += money;
		}
	}

	public void subtractMoney(double money) {
		if (money >= ZERO) {
			this.moneyBalance -= money;
		}
	}

	public double getSalary() {
		return this.salary;
	}

	public void printClientInfo() {
		System.out.println("Deposits: ");
		printAccountInfo(deposits);
		System.out.println();
		System.out.println("Credits: ");
		printAccountInfo(credits);
		System.out.println("***");
	}

	private void printAccountInfo( List<? extends BankAccount> list) {
		if (list != null) {
			for (BankAccount acc : list) {
				if (acc != null) {
					System.out.println(this.getName() + " have " + acc.getAccountBalance() + " lv ");
				}
			}
		}
	}

}
