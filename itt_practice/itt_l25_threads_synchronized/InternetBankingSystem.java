package lesson25_threads_synchronized;

import java.util.ArrayList;
import java.util.List;

public class InternetBankingSystem {

	static IAccount account;

	static class Hacker implements Runnable {

		int hackerAccount = 0;
		
		public Hacker(IAccount acc) {
			if (acc != null) {
				account = acc;
			}
		}

		@Override
		public void run() {
			System.out.println("hachink account ");
			synchronized (account) {
				account.withdraw(100);
				
				hackerAccount = account.getBalance();
				System.out.println("hacker blance : " + hackerAccount);
			}	
		}
	}

	public static void main(String[] args) {

		Account account = new Account(200);

//		for (int hacker = 1; hacker <= 10; hacker++) {
//			new Thread(new Hacker(account)).start();
//		}
		
		List<Thread> hackers = new ArrayList<Thread>();
		for (int hacker = 1; hacker <= 10; hacker++) {
			Thread hackerThread = new Thread(new Hacker(account));
			hackerThread.start();
			hackers.add(hackerThread);
		}
		
	}
}
