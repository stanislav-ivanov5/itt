package lesson04;

import java.util.Scanner;

/**
 * Да се състави програма, която въвежда в едномерен масив реални числа. Като
 * изход: програма извежда онези 3 различни числа, чиято абсолютна стойност
 * формира максималната обща сума.
 *
 * Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12 Изход: 5.1; 6.34; 7.13
 */

public class Zadacha15 {

	public static void main(String[] args) {
		
		// initialize k 
		int k = 3;
		
		Scanner sc = new Scanner(System.in);
		
		// enter array length
		System.out.println("Enter array length: ");
		int arrLength = sc.nextInt();
		while(arrLength < 1){
			System.out.println("Invalid input. Enter new length: ");
			arrLength = sc.nextInt();
		}
		
		// initialize array
		double[] arr = new double[arrLength];

		// input array elements
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextDouble();
		}
		
		sc.close();

		// temp variable, helps to switch values of array elements
		double temp = arr[0];
		
		
		
		// if first element is less than second switch them, and go that way with all eleemnts
		// sort the array
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < k; j++){
				double abs = (arr[j] > 0) ? arr[j] : -arr[j];
				if(abs < arr[i]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}				
			}
		}
		
		// print three biggest by absolute value numbers
		for(int i = 0; i < k; i++){
			System.out.println(arr[i] + " ");
		}
		
		
	}
}
