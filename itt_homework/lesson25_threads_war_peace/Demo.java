package lesson25_threads_war_peace;

import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 
 * @author stanislav5
 * Demo testing the main functionality
 */
public class Demo {
	private static final int NUM_PARTS = 5;
	private static final String FILE_LOCATION = "war_peace.txt";

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		// start time
		LocalTime startTime = LocalTime.now();

		// read text from file
		StringBuilder sb = null;
		sb = ReadStringFromFile.readText(FILE_LOCATION);

		// split text and save if in ArrayList
		List<String> splittedText = new ArrayList<String>(NUM_PARTS);
		splittedText = Partitioner.partitionText(sb, NUM_PARTS);

		// print duration time up to now
		System.out.print("Time: ");
		TimeHelper.printDuration(startTime);

		List<CounterTask> tasks = new ArrayList<CounterTask>();
		List<Thread> threads = new ArrayList<Thread>();

		// start all threads
		startThreads(splittedText, tasks, threads);

		// wait for all threads to finish
		for (Thread t : threads) {
			t.join();
		}

		// print duration time up to now
		System.out.print("Time: ");
		TimeHelper.printDuration(startTime);
		
		// count all commas
		AtomicInteger allCounts = calculateCounts(tasks);
		
		// print result
		System.out.printf("[%d threads] All comma number: %d \n", NUM_PARTS, allCounts.intValue());

		// read file
		// System.out.println(sb.toString());
	}

	static void startThreads(List<String> splittedText, List<CounterTask> tasks, List<Thread> threads) {
		for (int index = 0; index < NUM_PARTS; index++) {
			CounterTask task = new CounterTask(splittedText.get(index));
			Thread thread = new Thread(task);
			thread.start();
			tasks.add(task);
			threads.add(thread);
		}
	}

	static AtomicInteger calculateCounts(List<CounterTask> tasks) {
		AtomicInteger allCounts = new AtomicInteger(0);
		for (CounterTask t : tasks) {
			synchronized (allCounts) {
				allCounts.addAndGet(t.getAllCounts().intValue());
			}
		}
		return allCounts;
	}
}
