package lesson02;

import java.util.Scanner;

/**
 * 	Да се състави програма, която чете от конзолата 2 естествени
	двуцифрени числа a,b.
	Програмата да изведе в конзолата дали последната цифра от
	произведението на двете числа е четна, както и самата цифра.
	Входни данни: a,b - естествени числа от интервала [10..99].
	Пример: 15, 25
	Изход: 375, 5 нечетна
 */

public class Zadacha09 {

	public static void main(String[] args) {
		
		// define two numbers and last digit variable
		int a, b;
		int lastDigit;
		
		// input number A
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextInt();

		// check whether 10 < a < 99
		while ((10 > a) || (99 < a)) {
			System.out.println("a is in the range [10..99]. "
					+ "Enter new value");
			a = sc.nextInt();
		}
		
		// input number B
		System.out.println("Enter b: ");
		b = sc.nextInt();
		
		// check whether 10 < b < 99
		while ((10 > b) || (99 < b)) {
			System.out.println("b is in the range [10..99]. "
					+ "Enter new value");
			b = sc.nextInt();
		}
		
		// assign value to lastDigit
		lastDigit = (a * b) % 10;
		
		// check whether last digit of the number is even
		int lastDigitChecker = (a * b) & 1;

		if (lastDigitChecker % 10 == 0) {
			System.out.printf("%d %d even", (a * b), lastDigit);
		} else {
			System.out.printf("%d %d odd", (a * b), lastDigit);
		}

		sc.close();
	}

}
