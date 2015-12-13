package lesson04_tasks;

import java.util.Scanner;

public class T7 {

	public static void main(String[] args) {

		short a = 0;

		int b = 0, c = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a: ");
		a = sc.nextShort();
		// a is positive
		while (a < 0) {
			System.out.println("Invalid input. Enter new value:");
			a = sc.nextShort();
		}
		System.out.println("Enter b: ");
		b = sc.nextInt();
		// check if b and c < 7
		while (b > 7) {
			System.out.println("Invalid input. Enter new value: ");
			b = sc.nextInt();
		}
		System.out.println("Enter c: ");
		c = sc.nextInt();

		// validate if c < 7 and C == B
		while ((c > 7) || (c == b)) {
			System.out.println("Invalid input. Enter new value: ");
			c = sc.nextInt();
		}

		short temp = 1; // temp variable
		int counter = 1; // counter for counting how many times b is multiplied
							// and create a new number containing B digits

		// create number temp with B number of digits in binary system
		while (counter < b) {
			temp = (short) (temp << 1);
			counter++;
		}

		// change B-th bit of A
		a = (short) (a ^ temp);

		short tempC = 1; // temp variable
		int counterC = 1;

		// create number tempC with C number of digits in binary system
		while (counterC < c) {
			tempC = (short) (tempC << 1);
			counterC++;
		}

		// change C-th bit of A
		a = (short) (a ^ tempC);

		// print the amended value of A
		System.out.println(a);
	}
}
