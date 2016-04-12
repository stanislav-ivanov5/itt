package lesson25_threads_synchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Demo3 {

	static StringBuffer sb = new StringBuffer();
	static AtomicInteger counter = new AtomicInteger(1);

	void changeBuilder() {
		synchronized (sb) {
			sb.append("b " + (counter) + "\n");
			counter.incrementAndGet();
		}
	}

	public static void main(String[] args) {
		List<Thread> threads = new ArrayList<Thread>();

		for (int i = 1; i <= 100; i++) {
			threads.add(new Thread(() -> new Demo3().changeBuilder()));
		}

		threads.forEach(t -> t.start());

		threads.forEach(t -> {
			try {
				t.join();
			} catch (Exception e1) {
				System.out.println("don't write empty catch ever");
				e1.printStackTrace();
			}
		});

		synchronized (sb) {
			for (Thread t : threads) {
				try {
					t.join();
					System.out.println(sb);

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
