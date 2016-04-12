package lesson25_threads_kopach;

public class Kopach implements Runnable{

	Zarivach z;
	
	
	@Override
	public void run() {
		System.out.println("start kopaq");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("izkopah");
	}
	
	
}
