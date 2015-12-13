package lesson05;

/**
 * Имате двумерен масив от числа, чийто стойности са въведени предварително. Да
 * се отпечатат сумата на елементите на масива, както и средноаритметичното на
 * тези числа
 *
 */
public class Zadacha3 {

	public static void main(String[] args) {
		
		
		int r = 6; // rows
		int c = 5; // cols
		
		// given array
		int[][] arr = { { 48, 72, 13, 14, 15 }, 
				{ 21, 22, 53, 24, 75 },
				{ 31, 57, 33, 34, 35 }, 
				{ 41, 95, 43, 44, 45 },
				{ 59, 52, 53, 54, 55 }, 
				{ 61, 69, 63, 64, 65 }, };

		// assign value to result
		int result = arr[0][0];
		int average;
		
		// find result
		for(r = 0; r < arr.length; r++){
			for(c = 0; c < arr[0].length; c++){
				result += arr[r][c];
			}
		}
		
		// calculate average of array elements 
		average = result / (r*c);
		
		// print results
		System.out.printf("Sum: %d \n"
				+ "Average: %d",result, average);
	}
}
