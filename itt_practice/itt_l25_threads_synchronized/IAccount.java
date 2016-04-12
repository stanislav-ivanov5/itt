package lesson25_threads_synchronized;

public interface IAccount {

	void deposit(int amount);
	void withdraw(int amount);
	Integer getBalance();
}
