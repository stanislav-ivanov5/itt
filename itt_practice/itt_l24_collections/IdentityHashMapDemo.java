package lesson24_collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Vector;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		// don't do that
//		throw new NullPointerException();
//		int a = 5 / 0;


		Map<String, Integer> identityMap = new IdentityHashMap<String, Integer>();
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		Map<Map<String, Integer>, Integer> hashMap1 = new HashMap<Map<String, Integer>, Integer>();
		
		identityMap.put("a", 1);
		identityMap.put(new String("a"), 2);
		identityMap.put("a", 3);
		
		hashMap.put("a", 1);
		hashMap.put(new String("a"), 2);
		hashMap.put("a", 3);
		
		// use == to compare two keys
		System.out.println("identity map keyset size: " + identityMap.keySet().size());
		
		// use equals() to compare two keys
		System.out.println("hash map keyset size: " + hashMap.keySet().size());
		
	}
}
