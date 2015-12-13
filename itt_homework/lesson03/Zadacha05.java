package lesson03;

import java.util.Scanner;

/**
 * 	Да се въведат от потребителя 2 числа. И да се 
	изведат на екрана всички числа от по-малкото до по-голямото.
 *
 */

public class Zadacha05 {

	public static void main(String[] args) {
		// define and initialize two numbers
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);

		// input num1 and num2
		System.out.print("Enter first number: ");
		num1 = sc.nextInt();
		System.out.print("\n");
		System.out.print("Enter second number: ");
		num2 = sc.nextInt();

		// check if the num1 is greater than, less than or equal to num2
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				System.out.println(i);
			}
		} else {
			if (num1 == num2) {
				System.out.println("Numbers are equal");
			} else {
				for (int i = num1; i >= num2; i--) {
					System.out.println(i);
				}
			}
		}

		sc.close();
	}
}
