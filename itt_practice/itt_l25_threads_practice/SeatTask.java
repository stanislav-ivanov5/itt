package lesson25_threads_practice;

public class SeatTask implements Runnable {

	@Override
	public void run() {
		System.out.println("start seat");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end seat");
	}

}
