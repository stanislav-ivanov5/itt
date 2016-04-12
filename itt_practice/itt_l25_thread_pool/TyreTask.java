package lesson25_thread_pool;

public class TyreTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " start producing tire ");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " tire ready ");
	}

}
