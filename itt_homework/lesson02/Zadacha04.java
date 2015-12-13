package lesson02;

import java.util.Scanner;

/**
 * 	Въведете 2 различни числа от конзолата и ги разпечатайте в
	нарастващ ред.
 */

public class Zadacha04 {

	public static void main(String[] args) {
		// define and initialize a and b
		double a = 0.0d, b = 0.0d;

		// input the numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter A:");
		a = sc.nextDouble();

		System.out.println("Please enter B:");
		b = sc.nextDouble();

		// check if b is equal to a
		while (b == a) {
			System.out.println("b must not be equal to a. "
					+ "Please enter again value for b: ");
			b = sc.nextDouble();
		}

		// print a and b in ascending order
		System.out.println((a <= b) ? a : b);
		System.out.println((a > b) ? a : b);

		sc.close();
	}

}
