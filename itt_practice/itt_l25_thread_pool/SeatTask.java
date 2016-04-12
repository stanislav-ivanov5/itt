package lesson25_thread_pool;

public class SeatTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " start producing seat ");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " seat ready ");
	}
}
