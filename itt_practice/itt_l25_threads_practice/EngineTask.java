package lesson25_threads_practice;

public class EngineTask implements Runnable {

	@Override
	public void run() {

		System.out.println("start engine");

		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end engine");
	}
}
