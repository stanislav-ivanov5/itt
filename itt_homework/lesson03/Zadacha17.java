package lesson03;

import java.util.Scanner;

/**
 * 
 * Да се състави програма, която извежда квадрат, чийто страни са оформени със
 * знака *, а вътрешността е запълнена със въведен знак. Входни данни b -
 * дължина на страната число от интервала [3..20], c - желан знак. Програмата да
 * използва цикъл for.
 *
 */
public class Zadacha17 {

	public static void main(String[] args) {
		// define and initialize b = square side and c = given sign
		int b = 0;
		String c = null;
		// input stream
		Scanner sc = new Scanner(System.in);
		
		// input b (side of the square) and validate it 
		System.out.println("Enter b in the range [3..20]:");
		b = sc.nextInt();
		while ((b < 3) || (b > 20)) {
			System.out.println("Invalid input. Enter new value: ");
			b = sc.nextInt();
		}
		// input c as String
		System.out.println("Enter c:");
		c = sc.next();
		// close the input stream
		sc.close();

		// find where c cells should be printed and fill the rest of the fields with *
		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= b; j++) {
				if (((i > 1) && (i < b)) && ((j > 1) && (j < b))) {
					System.out.print(c);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
