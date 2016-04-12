package lesson25_threads_2;

public class MyThread2 implements Runnable {
	
	int x;
	
	@Override
	public void run() {
		while(x < 10000){
			System.out.println("in MyThread 2 ");
			x++;
		}
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
}
