package lesson25_thread_pool;

import java.time.Duration;
import java.time.Instant;

public class DemoTime {

	public static void main(String[] args) throws InterruptedException {

		Instant start = Instant.now();
		Thread.sleep(11000);
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end).getSeconds());
	}
}
