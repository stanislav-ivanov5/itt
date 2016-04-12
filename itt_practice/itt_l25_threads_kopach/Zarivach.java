package lesson25_threads_kopach;

public class Zarivach implements Runnable{

	Thread k;
	
	public Zarivach(Thread k) {
		this.k = k;
	}
	
	@Override
	public void run() {
		try {
			k.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("start zarivam");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("zarovih");
	}
	
}
