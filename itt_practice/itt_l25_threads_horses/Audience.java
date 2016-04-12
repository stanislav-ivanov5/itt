package lesson25_threads_horses;

public class Audience implements Runnable{

	ThreadGroup horses;
	
	
	
	public Audience(ThreadGroup horses) {
		super();
		this.horses = horses;
	}



	@Override
	public void run() {
		while(horses.activeCount() > 0){
			System.out.println("watching horses running ");		
		}
	}
	
}
