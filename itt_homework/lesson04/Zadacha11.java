package lesson04;

import java.util.Scanner;

/**
 * Да се състави програма, която въвежда от клавиатурата 7 цели числа 
 * в едномерен масив 
 * Програмата да изведе всички числа кратни на 5, но по големи от 5.
 * Пример: -23, -55, 17, 75, 56, 105, 134
 * Изход: 75,105 2 числа
 *
 */

public class Zadacha11 {

	public static void main(String[] args) {
	
		// initialize array
		int[] arr = new int[7];
		int counter = 0;	// to count how many numbers meet the requirements
		Scanner sc = new Scanner(System.in);
		
		// input array elements
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		
		// check the requirements and print the numbers
		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 5 == 0 && arr[i] > 5){
				System.out.print(arr[i] + " ");
				counter++;
				if(i < arr.length - 1){
					System.out.print(", ");
				}
			}
		}
		
		// print how many times such number is found
		if(counter == 0){
			System.out.println("There are no numbers divisible by which are greater than 5");
		}
		else {
			System.out.printf("%d numbers", counter);
		}
		
		sc.close();
		
	}
}
