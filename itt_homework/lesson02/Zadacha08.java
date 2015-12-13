package lesson02;

import java.util.Scanner;

/**
 * 	Да се състави програма, която чете от конзолата 4-цифренo
	естествено число от интервала [1000.. 9999]. От това число се
	формират 2 нови 2-цифрени числа. Първото число се формира от 1-та
	и 4-та цифра на въведеното число. Второто число се формира от 2-рa -
	3-та цифра на въведеното число. Като резултат да се изведе дали 1-то
	ново число e по-малко <, равно = или по-голямо от 2-то число.
	Пример: 3332 Изход: по-малко (32<33)
	Пример: 1144 Изход: равни (14=14)
	Пример: 9875 Изход: по-голямо (95>87)
 */

public class Zadacha08 {

	public static void main(String[] args) {
		// define the numbers
		int numberA, numberB, numberC;

		// define the number digits ( number = a*1000 + b*100 + c*10 + d)
		int aDigit, bDigit, cDigit, dDigit;

		// input four digits number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter four digits number: ");
		numberA = sc.nextInt();
		while ((1000 >= numberA) && (numberA >= 9999)) {
			System.out.println("The number should be "
					+ "in range [1000 ... 9999]." + "Enter new value: ");
			numberA = sc.nextInt();
		}

		// find the digits of number
		dDigit = numberA % 10;
		cDigit = (numberA / 10) % 10;
		bDigit = (numberA / 100) % 10;
		aDigit = (numberA / 1000) % 10;

		System.out.printf("Number A: %d%d%d%d %n", aDigit, bDigit, cDigit,
				dDigit);

		// assign new values to numberB and numberC
		numberB = (aDigit * 10) + dDigit;
		numberC = (bDigit * 10) + cDigit;

		// compare the numbers and print the result
		if (numberB < numberC) {
			System.out.printf("smaller (%d < %d)", numberB, numberC);
		} else if (numberB == numberC) {
			System.out.printf("equal (%d = %d)", numberB, numberC);
		} else {
			System.out.printf("greater (%d > %d)", numberB, numberC);
		}

		sc.close();
	}

}
