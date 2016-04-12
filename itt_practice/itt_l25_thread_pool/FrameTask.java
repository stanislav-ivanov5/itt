package lesson25_thread_pool;

public class FrameTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " start producing frame ");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " frame ready ");
	}

}
