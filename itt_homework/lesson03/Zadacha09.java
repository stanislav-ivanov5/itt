package lesson03;

import java.util.Scanner;

/**
 * Да се прочетат 2 числа от клавиатурата А и В. Да се изведат всички числа от А
 * до В на степен 2(разделени с запетая).Ако някое число е кратно на 3, да се
 * изведе съобщение че числото се пропуска „skip 3“.Ако сумата от всички
 * изведени числа (без пропуснатите) стане по-голяма от 200, да се прекрати
 * извеждането.
 *
 */

public class Zadacha09 {

	public static void main(String[] args) {

		// define numA, numB and
		// result for summation of printed values
		int numA, numB;
		int result = 0;
		int sqPower; // Square power

		// open input stream
		Scanner sc = new Scanner(System.in);

		// enter number A
		System.out.println("Enter A:");
		numA = sc.nextInt();

		// enter number B
		System.out.println("Enter B:");
		numB = sc.nextInt();

		// check whether B is equal to A
		while (numB == numA) {
			System.out.println("B = A, enter new value B:");
			numB = sc.nextInt();
		}

		// close input stream
		sc.close();

		// switch values of A and B in case A > B
		if(numA > numB){
			int temp;
			temp = numB;
			numB = numA;
			numA = temp;
		}

		for (int num = numA; num <= numB; num++) {
			// check if the current number is divisible by 3 and skip it
			if (num % 3 == 0) {
				System.out.print("skip 3");
				// print comma at the right place
				if (num < numB) {
					System.out.print(", ");
				}
				continue;
			}
			// squaring the current number and print it
			sqPower = num * num;
			System.out.print(sqPower);
			result += sqPower;
			if (result > 200) {
				break;
			}
			// print comma at the right place
			if (num < numB) {
				System.out.print(", ");
			}
		}
	}
}

