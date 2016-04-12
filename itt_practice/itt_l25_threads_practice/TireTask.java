package lesson25_threads_practice;

public class TireTask implements Runnable {

	@Override
	public void run() {
		System.out.println("start tire");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end tire");
	}

}
