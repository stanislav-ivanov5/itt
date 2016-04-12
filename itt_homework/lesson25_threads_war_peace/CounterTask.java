package lesson25_threads_war_peace;

import java.util.concurrent.atomic.AtomicInteger;

/** 
 * 
 * @author stanislav5
 * Counter Task
 *	
 */
public class CounterTask implements Runnable {

	private static final char SIGN = ',';

	private AtomicInteger allCounts;
	private String text;
	
	public CounterTask(String string) {
		if(string != null){
			this.text = string;
		}
		allCounts = new AtomicInteger(0);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " start counting...");

		for(int index = 0; index < text.length(); index++){
			if(text.charAt(index) == CounterTask.getSign()){
				allCounts.incrementAndGet(); 
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " end counting...");
	}
	
	
	
	public AtomicInteger getAllCounts() {
		return allCounts;
	}

	public static char getSign() {
		return SIGN;
	}
}
