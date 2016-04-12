package lesson25_threads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {

	public static void main(String[] args) {
		// implementing new Thread with anonymous class
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("from within the anonymous ");
			}
		}).start();

		new Thread((() -> System.out.println("do that in the lambda"))).start();
		
		// traverse a map 
		
		Map<String, String> map = new HashMap<String, String>();
		// using entry
		for(Entry<String, String> entry : map.entrySet()){
			entry.getValue();
			entry.getKey();
		}
		// using iterator
		for(Iterator<String> iterator = map.keySet().iterator(); iterator.hasNext();){
			iterator.next();
		}
	}
}
