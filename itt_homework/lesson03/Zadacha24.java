package lesson03;

import java.util.Scanner;

/**
 * Едно число X е палиндром, aко се чете еднакво отпред назад и отзад напред. Да
 * се състави програма, която проверява дали въведено число е палиндром. Входни
 * данни: N - естествено число от интервала [10 .. 30000]. Пример: 17571 Изход:
 * числото е палиндром Използвайте цикъл do-while.
 *
 */
public class Zadacha24 {

	public static void main(String[] args) {

		int num = 0;
		System.out.println("Enter n in the range [10..30000]:");

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		while (num < 10 || num > 30000) {
			System.out.println("Invalid input. Enter new value num:");
			num = sc.nextInt();
		}

		sc.close();

		int reverse = 0;
		int temp = num; 	// store the value of num to a temp variable

		/* add to reverse the num % 10 and miltiply it by 10
		 * then devide temp / 10 
		 * and continue the cycle until temp reaches 0 
		*/
		do {
			reverse = reverse + temp % 10;
			temp = temp / 10;
			if(temp > 0){
				reverse *= 10;				
			}
		} while (temp != 0);

		System.out.println(reverse);
		if (reverse == num) {
			System.out.println("Number is a palindrome. ");
		} else {
			System.out.println("Number is not a palindrome");
		}

	}
}
