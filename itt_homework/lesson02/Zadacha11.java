package lesson02;

import java.util.Scanner;

/**
 * 	Съставете програма, която по дадено трицифренo число проверява
	дали числото се дели на всяка своя цифра. Във въведеното число да
	няма цифра 0.
 *
 */

public class Zadacha11 {

	public static void main(String[] args) {
		// define and initialize a three digit number and variables for digits
		int threeDigitNumber = 0;
		int digitA = 0, digitB = 0, digitC = 0;

		Scanner sc = new Scanner(System.in);
		
		// enter the first digit of the number
		System.out.println("Enter first digit of a three digit number: "
				+ "The number can only contains digits [1..9]");
		digitA = sc.nextInt();
		
		// check the input
		while ((digitA == 0) || (digitA < 0) || (digitA > 9)) {
			System.out.println("Invalid input. Try again");
			digitA = sc.nextInt();
		}
		
		// enter the second digit of the number
		System.out.println("Enter second digit: ");
		digitB = sc.nextInt();
		
		// check the input
		while ((digitB == 0) || (digitB < 0) || (digitB > 9)) {
			System.out.println("Invalid input. Try again");
			digitB = sc.nextInt();
		}
		
		// input the third digit of the number
		System.out.println("Enter third digit: ");
		digitC = sc.nextInt();
		
		// check the input
		while ((digitC == 0) || (digitC < 0) || (digitC > 9)) {
			System.out.println("Invalid input. Try again");
			digitC = sc.nextInt();
		}
		
		// calculate the number using the values of known digits
		threeDigitNumber = (100 * digitA) + (10 * digitB) + (digitC);
		
		// check if the number is divisible by its digits
		if ((threeDigitNumber % digitA) == 0) {
			System.out.println("The number is divisible by first digit");
		} else {
			System.out.println("the first digit does not devide the number");
		}
		if ((threeDigitNumber % digitB) == 0) {
			System.out.println("The number is divisible by second digit");
		} else {
			System.out.println("the second digit does not devide the number");
		}
		if ((threeDigitNumber % digitC) == 0) {
			System.out.println("The number is divisible by third digit");
		} else {
			System.out.println("the third digit does not devide the number");
		}
		
		// close the stream
		sc.close();
	}
}
