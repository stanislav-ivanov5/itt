package lesson25_threads_synchronized;

public class Account implements IAccount {

	private Integer balance;

	public Account(int balance) {
		if (balance > 0) {
			this.balance = balance;
		}
	}

	@Override
	public void deposit(int amount) {
		synchronized (balance) {
			if (amount > 0) {
				System.out.println("blaance before transaction: " + this.balance);
				this.balance += amount;
				System.out.println("blaance after transaction: " + this.balance);
			}
		}

	}

	@Override
	public void withdraw(int amount) {
		synchronized (this.balance) {
			if (this.balance >= amount && amount >= 0) {
				System.out.println("blaance before transaction: " + this.balance);
				this.balance -= amount;
				System.out.println("blaance after transaction: " + this.balance);
			}
			else {
				System.out.println("not enough money");
			}
		}
	}


	public Integer getBalance() {
		return this.balance;
	}

}
