package lesson24.task2_letters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Counter {

	private static final int MAX_SIGNS = 20;
	private static final char POUND_SIGN = '#';

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter some text: ");
		String text = sc.nextLine();
		
		text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
		text = text.replaceAll(" ", "");
		
		Map<Character, Integer> letters = new HashMap<Character, Integer>();
		
		for (int index = 0; index < text.length(); index++) {
			int count = 1;
			Character ch = (Character)text.charAt(index);
			if(!letters.containsKey(ch)){
				letters.put(ch, count);
			}
			else {
				letters.put(ch, (int)letters.get(ch).intValue() + 1);
			}
		}
		
		Map<Integer, List<Character>> sortedMap = 
				new TreeMap<Integer, List<Character>>(Collections.reverseOrder());
		
		// sort the map
		for(Character ch : letters.keySet()){
			List<Character> list = new ArrayList<Character>();
			
			if(!sortedMap.keySet().contains(letters.get(ch))){
				list.add(ch);
				sortedMap.put(letters.get(ch), list);
			}
			else {
				list = sortedMap.get(letters.get(ch));
				list.add(ch);
				sortedMap.put(letters.get(ch), list);
			}
		}

		for(Integer integ : sortedMap.keySet()){
			for(Character ch : sortedMap.get(integ)){
				System.out.print(Character.toUpperCase(ch) + " : ");
				System.out.print(integ + " ");
				int max = Collections.max(sortedMap.keySet());
				printSign(calculateHowManyTimes(max, integ.intValue()), POUND_SIGN);
			}
		}
		
	}
	
	private static void printSign(int howManyTimes, char sign){
		
		for(int ch = 0; ch < howManyTimes; ch++){
			System.out.print(sign);
		}
		System.out.println();
	}
	
	private static int calculateHowManyTimes(int max, int current){
		return (int)((double)current / (double) max * MAX_SIGNS);
	}
}
