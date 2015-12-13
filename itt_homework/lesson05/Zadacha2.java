package lesson05;

import java.util.Scanner;

/**
 * Имате квадратен двумерен масив от естествени числа, чийто стойности се
 * въвеждат. Да се отпечатат диагоналите на масива.
 * 
 * Пример: 1 4 6 3 
 * 5 9 7 2 
 * 4 8 1 9 
 * 2 3 4 5
 * 
 * Изход: 1 9 1 5 
 * 3 7 8 2
 *
 */

public class Zadacha2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// prompt user for array length
		System.out.println("Enter array length: ");
		int n = sc.nextInt();

		// initialize array
		int[][] arr = new int[n][n];

		// prompt user for array elements
		System.out.println("Enter array elements: ");
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[0].length; col++) {
				arr[row][col] = sc.nextInt();
			}
		}

		// print first diagonal
		for (int r = 0; r < arr.length; r++) {
			System.out.print(arr[r][r] + " ");
		}

		// print second diagonal
		System.out.println();
		for (int r = 0; r < arr.length; r++) {
			System.out.print(arr[r][arr.length - r - 1] + " ");
		}

		sc.close();
	}
}
