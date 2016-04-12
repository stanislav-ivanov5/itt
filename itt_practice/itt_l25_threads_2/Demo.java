package lesson25_threads_2;

public class Demo {

	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		MyThread2 thread2 = new MyThread2();
		
		Thread myThread2 = new Thread(thread2, "ganka");
		
		thread1.setThread2(thread2);
		
		thread1.start();
		myThread2.start();

		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("in main method");
	}
}
