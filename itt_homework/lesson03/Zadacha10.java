package lesson03;

import java.util.Scanner;

/**
 * 	Въведете число от клавиатурата и определете дали е
	просто. Просто число е това което се дели САМО на 1 и на себе 
	си.
 *
 */

public class Zadacha10 {

	public static void main(String[] args) {
		// define and initialize number
		int num;

		// counter for all factors of the number 
		int counter = 0;

		// open input stream and user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		
		// validate the input
		while(num < 0){
			System.out.println("Invalid input. Enter new value: ");
			num = sc.nextInt();
		}
		
		// check how many factors has the number 
		for(int i = num; i > 1; i--){
			if(num % i == 0){
				counter++;
			} 
		}
		System.out.println("counter " + counter);
		
		// output if the number is prime based on the number of its factors
		if(counter > 1){
			System.out.println("Number is not prime");
		} 
		else {
			System.out.println("Number is prime");
		}
	}
}
