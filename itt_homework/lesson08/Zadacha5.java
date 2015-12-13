package lesson08;

import java.util.Scanner;

/**
 * Да се състави програма, чрез която се въвеждат 2 редици от знаци (думи). Ако
 * в двете редици участва един и същи знак, да се изведе на екрана първата
 * редица хоризонтално, а втората вертикално, така че да се пресичат в общия си
 * знак. Ако редиците нямат общ знак да се изведе само уведомително съобщение.
 * 
 * Пример : м а шапка и н а
 *
 */

public class Zadacha5 {

	// validate input method
	static void validateInput(Scanner sc, String lineOne) {
		boolean isValid = true;

		for (int i = 0; i < lineOne.length(); i++) {
			if (lineOne.charAt(i) == '1' || lineOne.charAt(i) == '2' || lineOne.charAt(i) == '3'
					|| lineOne.charAt(i) == '4' || lineOne.charAt(i) == '5' || lineOne.charAt(i) == '6'
					|| lineOne.charAt(i) == '7' || lineOne.charAt(i) == '8' || lineOne.charAt(i) == '9'
					|| lineOne.charAt(i) == '0' || lineOne.charAt(i) == ',' || lineOne.charAt(i) == '.'
					|| lineOne.charAt(i) == '/' || lineOne.charAt(i) == '[' || lineOne.charAt(i) == '['
					|| lineOne.charAt(i) == ';' || lineOne.charAt(i) == ':' || lineOne.charAt(i) == '\''
					|| lineOne.charAt(i) == '"') {
				isValid = false;
			}
			while (!isValid) {
				System.out.println("Invalid input. Enter new line: ");
				lineOne = sc.next();
				isValid = true;
			}
		}
	}

	// main method
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// user input 2 strings
		String word1 = sc.next();
		validateInput(sc, word1);
		String word2 = sc.next();
		validateInput(sc, word2);

		// boolean variable to check if both words have at least 1 same letter
		boolean doContain = false;

		// coordinates of the first letter which appear in both words
		int crossingPointX = 0;
		int crossingPointY = 0;

		// check if the words have 1 1etter in common
		for (int i = 0; i < word1.length(); i++) {
			for (int j = 0; j < word2.length(); j++) {
				if (word1.charAt(i) == word2.charAt(j)) {
					crossingPointX = i;
					crossingPointY = j;
					doContain = true;
				}
				if (doContain) {
					break;
				}
			}
		}

		System.out.println(crossingPointX + " " + crossingPointY);

		if (!doContain) {
			System.out.println("The lines don't contain equal characters.");
		}

		if (doContain) {
			// array with size the length of both words
			char[][] arr = new char[word1.length()][word2.length()];

			// fill vertical word in array
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (j == crossingPointY) {
						arr[i][j] = word1.charAt(i);
					}
				}
			}

			// fill horizontal word in array
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (i == crossingPointX) {
						arr[i][j] = word2.charAt(j);
					}
				}
			}

			// print the crossword
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] == 0) {
						arr[i][j] = '-';
					}
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
		}
	}
}
