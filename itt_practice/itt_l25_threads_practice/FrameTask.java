package lesson25_threads_practice;

public class FrameTask implements Runnable {

	@Override
	public void run() {
		System.out.println("start frame");

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end frame");
	}
}
