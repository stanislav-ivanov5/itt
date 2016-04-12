package lesson25_threads;

public class MyThread extends Thread {

	boolean working = true;
	
	@Override
	public void run(){
		int count = 1;
		while(working){
			
			System.out.println("running concurrent " + (count++));			
		}
		System.out.println("this is the end");
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}
	
	
}
