package lesson02;

import java.util.Scanner;

/**
	Въведете 2 различни целочислени числа от конзолата. Запишете
	тяхната сума, разлика, произведение, остатък от деление и
	целочислено деление в отделни променливи и разпечатайте тези
	резултати в конзолата. Опитайте същото с числа с плаваща запетая.
 *
 */

public class Zadacha02 {

	public static void main(String[] args) {

		// define and initialize a and b
		int a = 0, b = 0;

		int sum, product, modulo, division;

		// input the numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter A:");
		a = sc.nextInt();

		System.out.println("Please enter B:");
		b = sc.nextInt();

		// check if b is equal to a
		while (b == a) {
			System.out.println("b must not be equal to a. "
					+ "Please enter again value for b: ");
			b = sc.nextInt();
		}

		// doing the math operations
		sum = a + b;
		product = a * b;
		modulo = a % b;
		division = a / b;

		// printing the results of math operations
		System.out.printf("Sum: %n %d + %d = %d %n", a, b, sum);

		System.out.printf("Product: %n %d * %d = %d %n", a, b,
				product);
		System.out.printf("Modulo of %n a=%d and b=%d is equal %d %n", a, b,
				modulo);
		System.out.printf("Division: %n %d / %d = %d", a, b, division);

		sc.close();
		
//		Variant 2, floating numbers
//		define and initialize a and b
//		double a = 0, b = 0;
//
//		double sum, product, modulo, division;
//
//		// input the numbers
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter A:");
//		a = sc.nextDouble();
//
//		System.out.println("Please enter B:");
//		b = sc.nextDouble();
//
//		// check if b is equal to a
//		while (b == a) {
//			System.out.println("b must not be equal to a. "
//					+ "Please enter again value for b: ");
//			b = sc.nextDouble();
//		}
//
//		// doing the math operations
//		sum = a + b;
//		product = a * b;
//		modulo = a % b;
//		division = a / b;
//
//		// printing the results of math operations
//		System.out.printf("Sum: %n %f + %f = %f %n", a, b, sum);
//
//		System.out.printf("Product: %n %f * %f = %f %n", a, b,
//				product);
//		System.out.printf("Modulo of %n a=%f and b=%f is equal %f %n", a, b,
//				modulo);
//		System.out.printf("Division: %n %f / %f = %f", a, b, division);
//
//		sc.close();		
		
	}

}
