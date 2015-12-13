package lesson04;

import java.util.Scanner;

/**
 * Да се състави програма, чрез която се въвеждат 7 цели числа в 
 * едномерен масив. 
 * Програмата да изведе числото, което е най-близко до средната 
 * стойност на въведените числа.
 * Пример: 1,2,3,4,5,6,7
 * Изход: средна стойност 4, най-близка стойност 4
 *
 */

public class Zadacha10 {

	public static void main(String[] args) {
		
		double avg = 0.0d; // store the average of elements
		int sum = 0;	// sum of array elements
		double minSubtract;	// = arr[i] - avg
		
		// initialize array 
		int[] arr = new int[7];
		
		Scanner sc = new Scanner(System.in);
		
		// input array elements
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		// find sum
		for(int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		
		// find average and assign first proportion (arr[0] - avg) to minSubtract
		avg = (double) sum / arr.length;
		minSubtract = (arr[0] > avg) ? (arr[0] - avg) : (avg - arr[0]);
		int number = arr[0];
		
		// current subtract = arr[i] - avg
		for(int i = 0; i < arr.length; i++){
			double currSubtract = (((arr[i] - avg) > 0) ? 
					(arr[i] - avg) : (avg - arr[i]));
			// if lesser value of currSubtract is found, assign it to minSubtract
			if(currSubtract < minSubtract){
				minSubtract = currSubtract;
				number = arr[i]; // store value of closest number to avg when new minSubtract is found
			}
		}
		
		// print result
		System.out.printf("Average: %f\n", avg);
		System.out.printf("Closest number: %d", number);
	}
}
