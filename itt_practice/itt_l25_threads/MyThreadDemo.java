package lesson25_threads;

public class MyThreadDemo {

	public static void main(String[] args) {
		
		MyThread myThread1 = new MyThread();
		Thread myThread2 = new Thread(new MyThread());
		
		myThread1.start();
		myThread2.start();
		
		System.out.println("in the main method ");

		myThread1.setWorking(false);
	}
}
