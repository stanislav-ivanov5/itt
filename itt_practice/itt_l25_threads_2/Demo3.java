package lesson25_threads_2;

import java.util.concurrent.ConcurrentSkipListMap;

public class Demo3 {

	volatile static int counter;
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 1; i <= 1000; i++){
			Thread thread = new Thread( () -> {counter = counter + 1;}); 
			thread.start();
			thread.join();
		}
		
		System.out.println(counter);
	}
}
