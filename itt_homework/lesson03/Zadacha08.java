package lesson03;

import java.util.Scanner;

/**
 * По зададено число n, да се изведе на екрана таблица по следния начин:
 * 
 * Въведете n: Въведете n: Въведете n: Въведете n: 
 * 1...........2...........3...........4 
 * 0...........11..........222.........3333 
 * ............33..........444.........5555
 * ........................666.........7777
 * ....................................9999
 *
 */

public class Zadacha08 {

	public static void main(String[] args) {
		// initialize n
		int n;

		// open input stream
		Scanner sc = new Scanner(System.in);

		// enter n value
		System.out.println("Enter n:");
		n = sc.nextInt();

		// validate the input
		while ((n <= 0) || (n > 4)) {
			System.out.println("Invalid input. \n "
					+ "Enter new value n: [1..4]");
			n = sc.nextInt();
		}

		sc.close();

		// initialize number which will be printed to the console
		int num = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(num);
			}
			System.out.print("\n");
			num += 2;
		}
	}
}
