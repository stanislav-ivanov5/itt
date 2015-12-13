package lesson03;

import java.util.Scanner;

/**
 * Да се състави програма, която по въведено естествено число N от интервала
 * [10..200] извежда в обратен ред всички числа, които са кратни на 7 и са
 * по-малки от N
 *
 */

public class Zadacha14 {

	public static void main(String[] args) {
		// define number
		int num;
		Scanner sc = new Scanner(System.in);
		// user input for number
		System.out.println("Enter n int the range [10.. 200]:");
		num = sc.nextInt();

		// validate the input
		while ((num < 10) || (num > 200)) {
			System.out.println("Invalid input. Enter new value:");
			num = sc.nextInt();
		}
		
		// check if there are numbers divisible by 7 and print them
		for(int i = (num - 1); i > 1; i--){
			if(i % 7 == 0){
				System.out.print(i + " ");
			}
		}
	}
}
