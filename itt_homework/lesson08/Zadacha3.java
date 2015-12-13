package lesson08;

/**
 * Да се състави програма, чрез която се въвеждат последователно две 
 * редици от символи без интервали. Програмата да извежда съобщение за 
 * резултата от сравнението им по позиции.
 * 
 * Пример: хипопотам, хипопотук
 * Изход:
 * Двата низа са с равна дължина.
 * Разлика по позиции:
 * 8 а-у
 * 9 м-к
 */

import java.util.Scanner;

public class Zadacha3 {

	// prompt user for a string sequence
	static String inputString(Scanner sc) {
		System.out.println("Enter a sequence: ");
		String seq1 = sc.next();
		return seq1;
	}

	// compare two strings length
	static boolean compareLength(String s1, String s2) {
		if (s1.length() == s2.length()) {
			return true;
		} else {
			return false;
		}
	}

	// message if sequences have equal length
	static void printEqualLength(boolean equalLength) {
		if (!equalLength) {
			System.out.println("Both strings don't have equal length");
		}

		if (equalLength) {
			System.out.println("Both strings have equal length");
		}
	}

	// output different elements in two strings
	static void showDifference(String seq1, String seq2) {
		System.out.println("Different positions: ");
		for (int i = 0; i < seq1.length(); i++) {
			if (seq1.charAt(i) != seq2.charAt(i)) {
				System.out.print((i + 1) + " " + seq1.charAt(i) + "-"
						+ seq2.charAt(i) + "\n");
				continue;
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String seq1 = inputString(sc);
		String seq2 = inputString(sc);

		boolean equalLength = compareLength(seq1, seq2);

		printEqualLength(equalLength);

		if (equalLength) {
			showDifference(seq1, seq2);
		}

	}
}
