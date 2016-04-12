package lesson25_thread_pool;

public class EngineTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " start producing engine ");
		
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " engine ready ");
	}

}
