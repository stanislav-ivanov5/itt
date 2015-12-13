package lesson04;

import java.util.Scanner;

/**
 * Напишете програма, в която потребителя въвежда масив, след което елементите
 * на масива се обръщат в обратен ред (Целта не е масива да се отпечата в
 * обратен ред, ами първо да се обърне, след което да се отпечата в нормален
 * ред). Пробвайте да решите задачата първо с един допълнителен масив и после
 * без да използвате друг масив.
 *
 */

public class Zadacha9 {

	public static void main(String[] args) {

		// temp variable, helps to switch values of array elements
		int temp = 0;

		Scanner sc = new Scanner(System.in);

		// declare and validate input for array length
		System.out.println("Enter array length: ");
		int arrLength = sc.nextInt();
		while (arrLength < 1) {
			System.out.println("Invalid input. Enter new value: ");
			arrLength = sc.nextInt();
		}

		// initialize array
		int[] arr = new int[arrLength];

		// prompt user for array elements
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// original array
		System.out.println("Original: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// reverse array | switch values of first and last elements at first
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		System.out.println();

		// print reversed array
		System.out.println("Reverse: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();

		//Solve the task with 2 arrays 
		
//		// initialize array A
//		int[] arrA = new int[] { 0, 1, -5, 5, 5 };
//
//		// initialize array B with length of arrA
//		int[] arrB = new int[arrA.length];
//
//		// initialize counter j, assign to it last element of arrB
//		int j = arrB.length - 1;
//
//		// first element of A = last element of B
//		for (int i = 0; i < arrA.length; i++) {
//			arrB[j] = arrA[i];
//			j--;
//		}
//
//		// print arrB (reverse of arrA)
//		for (int i = 0; i < arrB.length; i++) {
//			System.out.printf("arr[%d] \t %d\n", i, arrB[i]);
//		}
	}
}
