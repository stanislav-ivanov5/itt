/**
 * 
 */
package com.ampleample.countLetters;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

/**
 * @author Stanislav Ivanov
 * 
 */
public class CountLettersHashMapTest {
	/**
	 * Test method for
	 * {@link com.ampleample.countLetters.CountLettersHashMap#printCounts()}.
	 */
	@Test
	public void testPrintCounts() {
		CountLettersHashMap testCounting = new CountLettersHashMap();
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
		
		testCounting.getChar("ehelo");
		
		testCounting.countLetters();
		
		assert
		
	}

}
