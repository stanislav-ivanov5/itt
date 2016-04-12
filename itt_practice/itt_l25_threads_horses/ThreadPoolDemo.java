package lesson25_threads_horses;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolDemo {

	static class ProduceBottleTask implements Callable<String> {

		@Override
		public String call() throws Exception {
			int i = 1;
			System.out.println("producing bottle " + (i++) + Thread.currentThread().getName());
			Thread.sleep(200);
			return "bottle " + (i) + Thread.currentThread().getName() + " produced ";
		};
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		
		List<Future<String>> futureBottles = new ArrayList<Future<String>>();
		
		for (int i = 1; i <= 100; i++) {
			Future<String> futureBottle = threadPool.submit(new ProduceBottleTask());
			futureBottles.add(futureBottle);
		}
		
		int i = 0;
		for (Future<String> bottle : futureBottles) {
			System.out.println("they gave me: ");
			System.out.println((++i) + bottle.get());
		}

		threadPool.shutdown();
	}
}
