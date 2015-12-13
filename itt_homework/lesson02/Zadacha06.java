package lesson02;

import java.util.Scanner;

/**
 * 	Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
	им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
	а3 да има старата стойност на а1.
 */

public class Zadacha06 {

	public static void main(String[] main) {

		// define three numbers a1, a2, a3
		double a1, a2, a3;
		double temp;

		// input a1
		Scanner sc = new Scanner(System.in);
		System.out.print("a1: ");
		a1 = sc.nextDouble();

		// input a2
		System.out.print("a2: ");
		a2 = sc.nextDouble();

		// input a3
		System.out.print("a3: ");
		a3 = sc.nextDouble();

		// print the numbers before switching
		System.out.printf("Before switching: %n a1=%f %n a2=%f %n a3=%f %n",
				a1, a2, a3);

		// switch values of the numbers
		temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;

		// print the numbers after switching
		System.out.printf("After switching: %n a1=%f %n a2=%f %n a3=%f %n", a1,
				a2, a3);

		// close the input stream
		sc.close();
	}

}
