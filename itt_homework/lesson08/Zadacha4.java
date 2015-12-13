package lesson08;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Да се състави програма, чрез която по въведени трите имена на двама човека
 * разделени със запетая, се извежда чие име има по-голям сбор от ASCII кодовете
 * на съставящите името букви. Пример: Anna Dosewa Asenowa, Iwo Peew Peew Изход:
 * Anna Dosewa Asenowa
 *
 */

public class Zadacha4 {

	// find where the ',' is
	static int findCommaIndex(String twoNames) {
		int where = 0;
		for (int i = 0; i < twoNames.length(); i++) {
			if (twoNames.charAt(i) == ',') {
				where = i;
			}
		}
		return where;
	}

	// find sum of ascii codes of a string 
	static int asciiSum(String string) {
		int result = 0;
		for (int i = 0; i < string.length(); i++) {
			result += (int) string.charAt(i);
		}
		return result;
	}

	// print result of comparison of two strings
	private static void printComparison(String firstNames, String lastNames, int firstNamesSum, int lastNamesSum) {
		boolean isBigger = (firstNamesSum > lastNamesSum) ? true : false;

		if (isBigger) {
			System.out.println(firstNames);
		} else {
			System.out.println(lastNames);
		}
	}

	// main method
	public static void main(String[] args) {

		// initialize string variables for 2 names
		String twoNames = "Anna Dosewa Asenowa, Iwo Peew Peew";

		// comma index
		int where = findCommaIndex(twoNames);

		// initialize new strings containing each full name
		String firstNames = twoNames.substring(0, where).trim();
		String lastNames = twoNames.substring(where + 1, twoNames.length()).trim();

		// initialize variables for ascii codes sum of both names
		int firstNamesSum = 0;
		int lastNamesSum = 0;

		// assign values 
		firstNamesSum = asciiSum(firstNames);
		lastNamesSum = asciiSum(lastNames);

		// print result
		printComparison(firstNames, lastNames, firstNamesSum, lastNamesSum);
	}
}
