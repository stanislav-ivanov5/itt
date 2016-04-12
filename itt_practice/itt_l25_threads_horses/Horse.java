package lesson25_threads_horses;

public class Horse implements Runnable {

	public static int TIME_TO_RUN_A_MILE = 10;
	
	@Override
	public void run() {
		System.out.println(getHorseName() + " horse start running ");

		for (int mile = 1; mile < 50; mile++) {

			try {
				Thread.sleep(getTimeToRunAMile());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(getHorseName() + " horse is at " + mile);
		}
		System.out.println(getHorseName() + " just finished");
	}
	
	String getHorseName() {
		return Thread.currentThread().getName();
	}

	protected int getTimeToRunAMile() {
		return TIME_TO_RUN_A_MILE;
	}
}
