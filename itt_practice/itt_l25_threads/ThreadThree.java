package lesson25_threads;

public class ThreadThree implements Runnable {

	@Override
	public void run() {
		System.out.println("running 3 " + Thread.currentThread().getName());
	}
}
