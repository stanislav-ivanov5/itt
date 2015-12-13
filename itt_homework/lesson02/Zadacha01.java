package lesson02;

import java.util.Scanner;

/**
	Да се изведат съобщения към потребителя и да се прочетат 2 числа от
	клавиатурата A и B (може да са с плаваща запетая – double).
	После да се прочете 3-то число C и да се провери дали то е м/у A и B.
	Да се изведе подходящо съобщение за това дали C е между A и B.
 */

public class Zadacha01 {

	public static void main(String[] args) {

		
		// define and initialize the three numbers
		double a = 0.0d, b = 0.0d, c = 0.0d;
		double min = 0.0d, max = 0.0d;

		// input the numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter A:");
		a = sc.nextDouble();

		System.out.println("Please enter B:");
		b = sc.nextDouble();

		System.out.println("Please enter C:");
		c = sc.nextDouble();

		// check whether a or b is bigger and assign values to min and max
		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		// check whether the value of c is between a and b
		if ((min < c) && (c < max)) {
			System.out.printf("%f is between %f and %f", c, a, b);
		} 
		else {
			if((c == min ) || (c == max)) {
				System.out.printf("%f is between %f and %f", c, a, b);
			} 
			else {
				System.out.printf("%f is not between %f and %f", c, a, b);
			}
		}

		sc.close();
	}
}
