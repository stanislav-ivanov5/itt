package lesson25_thread_pool;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {

	
	public static void main(String[] args) {
		
//		ExecutorService pool2 = Executors.newFixedThreadPool(6);
//		pooling(pool2);
//		pool2.shutdown();
		
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		List<Future> futureParts = new ArrayList<Future>();
		
		Instant start = Instant.now();

		futureParts.add(pool.submit(new EngineTask()));
		futureParts.add(pool.submit(new FrameTask()));
		
		for (int tyre = 1; tyre <= 4; tyre++) {
			futureParts.add(pool.submit(new TyreTask()));
		}
		
		for (int seat = 1; seat <= 5; seat++) {
			futureParts.add(pool.submit(new SeatTask()));
		}

		Instant end = Instant.now();
		System.out.println(Duration.between(start, end).getSeconds());
		
		pool.shutdown();

		
	}

	static void pooling(ExecutorService pool) {
		pool.submit(new EngineTask());
		pool.submit(new FrameTask());
		
		for (int tyre = 1; tyre <= 4; tyre++) {
			pool.submit(new TyreTask());
		}
		
		for (int seat = 1; seat <= 5; seat++) {
			pool.submit(new SeatTask());
		}
	}
}
