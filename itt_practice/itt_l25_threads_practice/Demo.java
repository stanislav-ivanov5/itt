package lesson25_threads_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	private static final int NUMBER_OF_ASSEMBLY_LINES = 3;
	private static final int NUMBER_OF_TYRES = 4;
	private static final int NUMBER_OF_SEATS = 5;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService carsPartsPool = Executors.newFixedThreadPool(NUMBER_OF_ASSEMBLY_LINES);
		
		List<Future> parts = new ArrayList<Future>();
		long milis = System.currentTimeMillis();
		
		parts.add(carsPartsPool.submit(new EngineTask()));
		parts.add(carsPartsPool.submit(new FrameTask()));
		
		for (int tyre = 1; tyre <= NUMBER_OF_SEATS; tyre++) {
			parts.add(carsPartsPool.submit(new SeatTask()));
		}
		
		for (int tyre = 1; tyre <= NUMBER_OF_TYRES; tyre++) {
			parts.add(carsPartsPool.submit(new TireTask()));
		}
		
		for (int part=0; part < parts.size(); part++) {
			parts.get(part).get();
		}
		
		//already produced
		System.out.println((System.currentTimeMillis() - milis));
		carsPartsPool.shutdown();
	}
}
