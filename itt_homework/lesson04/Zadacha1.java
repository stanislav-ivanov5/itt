package lesson04;

import java.util.Scanner;

/**
 * Да се прочете масив и да се намери най-малкото число кратно на
 * 3 от масива
 *
 * 10, 3, 5, 8, 6, -3, 7 
 * Най-малкото число кратно на 3 е - 3
 */

public class Zadacha1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// prompt user for array length
		System.out.println("Enter array length: [3..20]");
		int arrLength = 0;
		arrLength = sc.nextInt();

		// validate length
		while (arrLength < 3 || arrLength > 20) {
			System.out.println("Invalid input. Length [3.. 20]");
			arrLength = sc.nextInt();
		}

		// declare array
		int[] array = new int[arrLength];

		System.out.println("Enter array values: ");

		// prompt user for array values
		for (int i = 0; i < array.length; i++) {
			System.out.print(" [" + i + "] ");
			array[i] = sc.nextInt();
		}

		sc.close();

		// assign first array value to min variable
		int min = array[0];

		// check whether min is greater than the rest of the values
		for (int j = 0; j < array.length; j++) {
			if ((min > array[j]) && (array[j] % 3 == 0)) {
				min = array[j];
			}
		}

		/*
		 * if min has changed its value print the min value of array otherwise
		 * print there are no numbers divisible by 3 in the array
		 */
		if (min % 3 == 0) {
			System.out.println("Minimum value of array is: " + min);
		} else {
			System.out.println("Array doesn't contain values divisible by 3");
		}

	}
}
