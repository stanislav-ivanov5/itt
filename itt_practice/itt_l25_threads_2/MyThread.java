package lesson25_threads_2;

public class MyThread extends Thread {

	boolean working = true;
	MyThread2 thread2;
	
	@Override
	public void run() {
		while(working){
			thread2.setX(5);
			System.out.println("in MyThread 1");
		}
		System.out.println("my thread 1 ends");
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}

	public MyThread2 getThread2() {
		return thread2;
	}

	public void setThread2(MyThread2 thread2) {
		this.thread2 = thread2;
	}
	
	
}
