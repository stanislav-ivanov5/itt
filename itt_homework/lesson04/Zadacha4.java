package lesson04;

import java.util.Scanner;

/**
 * Да се прочете масив и да се отпечата дали е огледален.
 * Следните масиви са огледални:
 * [3 7 7 3]
 * [4]
 * [1 55 1]
 * [6 27 -1 5 7 7 5 -1 27 6]
 * 
 */

public class Zadacha4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arrLength = 0;
		System.out.println("Enter array length: ");
		arrLength = sc.nextInt();

		int[] arr = new int[arrLength];

		// prompt user for array elements
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// initialize flag variable, use it to flag if the array has mirror elements
		boolean flag = false;

		// check if the first element is equal to the last one
		for (int i = 0; i < arrLength / 2; i++) {
			for (int j = arrLength - 1; j >= arrLength / 2; j--) {
				if (arr[i] == arr[j]) {
					flag = true;
				}
			}
		}

		// if array has only 1 element it's mirrored
		if (arrLength == 1) {
			flag = true;
		}

		// print the result 
		if (flag == true) {
			System.out.println("Mirror array");
		} else {
			System.out.println("Array is not mirrored");
		}
		sc.close();
	}
}
