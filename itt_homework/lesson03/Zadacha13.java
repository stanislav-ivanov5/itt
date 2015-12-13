package lesson03;

import java.util.Scanner;

/**
 * Да се състави програма, която извежда всички естествени трицифрени числа,
 * които имат сбор на цифрите равен на дадено число. Дадено : sum, където
 * 2>=sum<=27. Пример: 26 Изход: 899, 989, 998.
 *
 */
public class Zadacha13 {

	public static void main(String[] args) {
		//define and initialize a, b, c - for number digits
		int a = 0, b = 0, c = 0;
		int sum = 0;	// digits sum 

		Scanner sc = new Scanner(System.in);
		
		// user input for sum
		System.out.println("Enter sum in the range [2..27]");
		sum = sc.nextInt();

		// validate sum [2 .. 27]
		while ((sum < 2) || (sum > 27)) {
			System.out.println("Invalid input. Enter new value: ");
			sum = sc.nextInt();
		}
		// check all three digits numbers 
		for (int num = 100; num < 1000; num++) {
			// calculate number digits
			a = (num / 100) % 10;
			b = (num / 10) % 10;
			c = num % 10;
			// print the number if sum of digits = user input
			if ((a + b + c) == sum) {
				System.out.print(num + " ");
			}
		}
	}
}
