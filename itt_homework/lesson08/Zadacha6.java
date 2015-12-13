package lesson08;

import java.util.Scanner;

/**
 * Да се състави програма, чрез която се въвежда изречение с отделни думи. Като
 * резултат на екрана да се извежда същия текст, но всяка отделна дума да
 * започва с главна буква, а следващите я букви да са малки. Пример: супер яката
 * задача Изход: Супер Яката Задача
 *
 */
public class Zadacha6 {

	public static void main(String[] args) {

		// String sentence = "ivan dava pari";

		// input a sentence
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		// split the sentence by interval
		String[] arr = sentence.split(" ");

		// create new string with Uppercase and assign to the first string
		// upper first letter and all other smaller letters
		for (int i = 0; i < arr.length; i++) {
			String up = arr[i].toUpperCase();
			arr[i] = up.charAt(0) + arr[i].substring(1, arr[i].length());
		}

		// store array elements in StringBuilder
		StringBuilder sb = new StringBuilder(200);
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			sb.append(" ");
		}
		
		// print result
		System.out.println(sb.toString());
	}
}
