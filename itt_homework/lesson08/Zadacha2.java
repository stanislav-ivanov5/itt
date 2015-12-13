package lesson08;

/**
 * Да се състави програма, чрез която от клавиатурата се въвеждат 
 * последователно две думи с дължина 10-20 знака.
 * Програмата да размени първите им 5 знака и да изведе дължината на 
 * по-дългата, както и новото им съдържание.
 * Пример: uchilishe uchenik
 * Изход: 9 uchenishe
 */

import java.util.Scanner;

public class Zadacha2 {

	private static String validateLength(Scanner sc, String word1) {
		while (word1.length() < 10 || word1.length() > 20) {
			System.out.print("Invalid length. \n Enter new word: ");
			word1 = sc.next();
		}
		return word1;
	}

	private static void fillArray(String word1, char[] arr1) {
		for (int i = 0; i < word1.length(); i++) {
			arr1[i] = word1.charAt(i);
		}
	}

	private static void replaceElements(char[] arr1, char[] arr2) {
		for (int i = 0; i < 5; i++) {
			char temp = arr1[0];
			arr1[i] = arr2[i];
			arr2[i] = temp;
		}
	}

	private static void printArrays(char[] arr1, char[] arr2) {
		if (arr1.length > arr2.length) {
			System.out.print(arr1.length + " ");
			for (int i = 0; i < arr1.length; i++) {
				System.out.print(arr1[i]);
			}
		} else {
			System.out.print(arr2.length + " ");
			for (int i = 0; i < arr2.length; i++) {
				System.out.print(arr2[i]);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// prompt user for first word
		System.out.println("Enter word one: ");
		String word1 = sc.next();

		word1 = validateLength(sc, word1);

		// prompt user for second word
		System.out.println("Enter word two: ");
		String word2 = sc.next();

		word1 = validateLength(sc, word2);

		sc.close();
		// two arrays of char to store words letters
		char[] arr1 = new char[word1.length()];
		char[] arr2 = new char[word2.length()];

		// print both words
		System.out.println(word1 + " " + word2);

		// fill array1 with letters from word1
		fillArray(word1, arr1);
		fillArray(word2, arr2);

		// replace first 5 elements of both arrays
		replaceElements(arr1, arr2);

		// print result in cases one length is bigger than the other
		printArrays(arr1, arr2);
	}
}
