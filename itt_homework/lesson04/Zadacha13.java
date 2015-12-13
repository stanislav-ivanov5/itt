package lesson04;

import java.util.Scanner;

/**
 * Да се състави програма, чрез която се въвежда число и се представя като число
 * в двоична бройна система. Програмата, чрез масив, да изчислява последователно
 * всички цифри на въведеното естествено число в 2-ична бройна система
 *
 * Пример: 99 Изход: 1100011
 */

public class Zadacha13 {

	public static void main(String[] args) {
		// declare and initialize number and digits
		int num = 0;
		int digits = 0;

		// enter number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");

		num = sc.nextInt();

		boolean isPositive = (num >= 0) ? true : false;

		int temp = (num >= 0) ? num : -num;

		// find number digits
		while (temp > 0) {
			temp /= 2;
			digits++;
		}

		// define array with digits as length
		int[] arr = new int[digits];

		// Case 1: number is positive

		// use array to store binary number representation of the positive
		// number entered
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (num >= 0) ? num % 2 : -(num % 2);
			num /= 2;
		}

		// print the binary representation if the number is positive
		if (isPositive) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
		}

		System.out.println();

		// Case 2: number is negative

		if (!isPositive) {

			// initialize new array to copy the first array in
			short[] negativeArr = new short[16];

			// fill new array with positive binary representation of the number
			for (int i = 0; i < arr.length; i++) {
				negativeArr[negativeArr.length - arr.length + i] = (short) arr[i];
			}

			// negate new array elements
			for (int i = 0; i < negativeArr.length; i++) {
				negativeArr[i] = (short) ((negativeArr[i] == 0) ? 1 : 0);
			}

			// add 1 at the end of the "binary " negative number
			for (int j = negativeArr.length - 1; j >= 0; j--) {
				// if the last element is 1, continue searching for "0" element
				if (negativeArr[j] == 1) {
					continue;
				}
				// if the last element is 0, update it to 1
				// if the last element is 1, update the element before it to 1
				// and the elements after it to 0.
				else {
					negativeArr[j] = 1;
					for (int i = j + 1; i < negativeArr.length; i++) {
						negativeArr[i] = 0;
					}
					break;
				}
			}
			
			// print negative "binary"
						for (int i = 0; i < negativeArr.length; i++) {
							System.out.print(negativeArr[i]);
						}

		}

	}
}
