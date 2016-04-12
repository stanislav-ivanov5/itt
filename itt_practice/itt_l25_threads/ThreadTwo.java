package lesson25_threads;

public class ThreadTwo implements Runnable {

	@Override
	public void run() {
		System.out.println("running 2 " + Thread.currentThread().getName());
	}

}
