package lesson24.task1_bank;

public class Demo {

	private static final int MIN_PERCENT = 80;
	private static final int MAX_PERCENT = 100;
	private static final int MAX_CLIENT_NUM = 10;

	public static void main(String[] args) {

		// create deposits and credits
		BankProduct shortDeposit = new DepositProduct(3, 3, "short deposit");
		BankProduct longDeposit = new DepositProduct(12, 5, "long deposit");

		BankProduct homeCredit = new CreditProduct(6, "home credit");
		BankProduct consumerCredit = new CreditProduct(10, "consumer credit");

		// create bank
		Bank oneBank = new Bank("oneBank");
		// add products
		oneBank.addProduct(shortDeposit);
		oneBank.addProduct(longDeposit);
		oneBank.addProduct(consumerCredit);
		oneBank.addProduct(homeCredit);

		// create 10 clients
		String name = "client";
		double money = 500;
		double salary = 500;

		Client[] clients = new Client[MAX_CLIENT_NUM];

		// give initial money and salary to clients
		for (int index = 0; index < MAX_CLIENT_NUM; index++) {
			clients[index] = new Client(name + (index + 1), money, salary);
			money += 50;
			salary += 100;
		}

		// generate random accounts to clients
		generateDeposits(shortDeposit, longDeposit, oneBank, clients);

		// print bank total balance and reserve
		oneBank.printBalance();
		
		// clients get credits
		generateCreditAccounts(homeCredit, consumerCredit, oneBank, clients);
		
		// print all clients information
		for(Client c : clients){
			c.printClientInfo();
		}
		
		// print bank info after transactions
		oneBank.printBalance();
	}

	
	
	static void generateCreditAccounts(BankProduct homeCredit, BankProduct consumerCredit, Bank oneBank,
			Client[] clients) {
		for (int client = 0; client < clients.length; client++) {
			// generate random money for each credit
			int random = ((int) (Math.random() * (MAX_PERCENT - MIN_PERCENT))) + MIN_PERCENT;
			double money2 = (random / (double) MAX_PERCENT) * clients[client].getMoneyBalance();

			int random2 = ((int) (Math.random() * (2 - 1))) + 1;
			switch (random2) {
			case 1:
				clients[client].askForCredit(oneBank, money2, (CreditProduct)homeCredit);
				break;
			case 2:
				clients[client].askForCredit(oneBank, money2, (CreditProduct)consumerCredit);
				break;
			default:
				break;
			}
		}
	}

	static void generateDeposits(BankProduct shortDeposit, BankProduct longDeposit, Bank oneBank, Client[] clients) {
		for (int client = 0; client < clients.length; client++) {
			int random = ((int) (Math.random() * (MAX_PERCENT - MIN_PERCENT))) + MIN_PERCENT;
			double money2 = (random / (double) MAX_PERCENT) * clients[client].getMoneyBalance();

			int random2 = ((int) (Math.random() * (2 - 1))) + 1;
			switch (random2) {
			case 1:
				clients[client].openDeposit(oneBank, money2, shortDeposit);
				break;
			case 2:
				clients[client].openDeposit(oneBank, money2, longDeposit);
				break;
			default:
				break;
			}
		}
	}

}
