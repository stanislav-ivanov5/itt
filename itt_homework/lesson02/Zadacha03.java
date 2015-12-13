package lesson02;

import java.util.Scanner;

/**
 * 	Въведете 2 различни числа от конзолата и разменете стойността им.
	Разпечатайте новите стойности
 *
 */

public class Zadacha03 {

	public static void main(String[] args) {
		// define and initialize a and b
		double a = 0.0d, b = 0.0d;

		// define a temp variable
		double temp;

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

		System.out.printf("Before switching the values: a=%f, b=%f %n", a, b);

		// switch values of a and b
		temp = a;
		a = b;
		b = temp;

		System.out.printf("After switching the values: a=%f, b=%f", a, b);

		sc.close();
	}

}
