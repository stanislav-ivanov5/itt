package lesson25_threads;

import java.util.ArrayList;
import java.util.List;

public class RunnableClass implements Runnable{

	@Override
	public void run() {
		System.out.println("running 1 " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		List<Thread> threads = new ArrayList<Thread>();
		for(int i = 0; i < 3; i++){
			threads.add(new Thread(new RunnableClass(), "thread" + i));
			threads.add(new Thread(new ThreadTwo(), "thread" + i));
			threads.add(new Thread(new ThreadThree(), "thread" + i));
		}
		
		
		
		for(Thread t : threads){
			t.start();
		}

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("start from within anonymous class" + Thread.currentThread().getName());
				
			}
			
		}).start();
		
		new Thread(() -> System.out.println("start another thread" + Thread.currentThread().getName())).start();
	}

}
