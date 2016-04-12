package lesson25_threads_kopach;

public class Demo {

	public static void main(String[] args) {
		
		Thread kopachT = new Thread(new Kopach(), "kopach");

		Thread zarivachT = new Thread(new Zarivach(kopachT), "zarivach");
		
		kopachT.start();
		zarivachT.start();
	}
}
