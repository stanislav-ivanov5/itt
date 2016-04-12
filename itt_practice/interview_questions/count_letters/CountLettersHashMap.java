package com.ampleample.countLetters;

import java.util.HashMap;

/**
 * 
 * @author Stanislav Ivanov
 * @see The application uses {@link HashMap} to count the letters in a String
 * 
 */

public class CountLettersHashMap {

	private static String theString;
	private static char[] chars = theString.toCharArray();

	//
	private static HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

	// getter for a String
	private String getString(String theString) {
		return theString;
	}

	public static char[] getChar(String theString) {
		return theString.toCharArray();
	}

	// a method for count the letters
	public static void countLetters() {
		for (int i = 0; i < chars.length; i++) {
			if (!hashMap.containsKey(chars[i])) {
				hashMap.put(chars[i], 1);
			}
			hashMap.put(chars[i], hashMap.get(chars[i] + 1));
		}
	}

	// print the HashMap.
	public void printCounts() {
		System.out.println(hashMap.toString());
	}
}
