package lesson03;

import java.util.Scanner;

/**
 * 
 * Да се състави програма, която извежда първите 10 най-малки числа, които се
 * делят на 2, 3 или на 5 и които са по-големи от въведено естествено число.
 * Числата се извеждат, заедно с техния пореден номер. Входни данни: число от
 * интервала [1..999] Пример: 1 Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10,
 * 9:12, 10:14 Използвайте цикъл while.
 */

public class Zadacha22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number in range [1..999] ");
		int num = 0;
		num = sc.nextInt();

		int i = 1; // counter for the first loop, where we print number from 1..10
		int j = 1;	// counter for the current number divisible by 2, 3 or 5

		// validate the input
		while (num < 1 || num > 999) {
			System.out.println("Invalid input. Enter new value: ");
			num = sc.nextInt();
		}

		while (i <= 10) {
			System.out.print(i + ":");

			while(j <= 10){
				
				if ((num % 2) == 0 || (num % 3) == 0 || (num % 5) == 0) {
					System.out.print(num);
					num++;
					j++;
					if (i < 10) {
						System.out.print(", ");
					}
					break;
				}
				num++;				
			}
			
			i++;
		}
	}
}