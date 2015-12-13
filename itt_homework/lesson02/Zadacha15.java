package lesson02;

import java.util.Scanner;

/**
 * 	Да се състави програма, която въвежда естествено число от интервала
	[0..24].
	Програмата да изведе съответстващо съобщение съобразно въведения
	час.
	Периодите са:
	[18..4] - Добър вечер;
	[4..9] - Добро утро;
	[9..18] - Добър ден
	Пример: 10
	Изход: Добър ден
 *
 */

public class Zadacha15 {

	public static void main(String[] args) {
		// define and initialize number for hours
		int number = 0;
		
		// open an input stream and input the hours
		System.out.println("Enter an hour in the range [0..24]: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		// validate the input
		while ((number < 0) || (number > 24)) {
			System.out.println("Invalid input. Try again: ");
			number = sc.nextInt();
		}
		
		// close the input stream
		sc.close();
		
		// match the hours with the greeting
		if (((number >= 18) && (number <= 24))
				|| ((number >= 0) && (number <= 4))) {
			System.out.println("Добър вечер");
		} else if ((number >= 4) && (number <= 9)) {
			System.out.println("Добро утро");
		} else if ((number >= 9) && (number <= 18)) {
			System.out.println("Добър ден");
		}
	}
}
