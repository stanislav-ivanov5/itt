package lesson08;

/**
 * Да се състави програма, която по даден низ връща друг, 
 * символите, на който са получени като към всеки код на символ от ASCII
 * таблицата е добавеното числото 5 и е записан новополучения символ
 * Вход: Hello
 * Изход: Mjqqt
 * 
 */

import java.util.Scanner;

public class Zadacha10 {

	// update each char[] element with new value, and append it to
	// the string builder
	static void extract(char[] chArr, StringBuilder sb) {
		for (int i = 0; i < chArr.length; i++) {
			chArr[i] = (char) (chArr[i] + 5);
			sb.append(chArr[i]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// input string
		String str = sc.next();

		// covert the string to char[] array
		char[] chArr = str.toCharArray();
		StringBuilder sb = new StringBuilder(50); // initialize string builder

		extract(chArr, sb);

		// print the result
		System.out.println(sb.toString());
		sc.close();
	}
}
