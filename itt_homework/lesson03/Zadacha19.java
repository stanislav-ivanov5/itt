package lesson03;

import java.util.Scanner;

/**
 * Да се състави програма, чрез която по въведено естествено число от интервала
 * [10..99] се извежда поредица числа, при спазване на следните изисквания: 1)
 * ако предходното число е четно се извежда 0.5*числото; 2) ако предходното
 * число е нечетно се извежда 3*числото +1. Извеждането продължава докато не се
 * получи стойност 1.
 * 
 * Пример: 11 Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
 */
public class Zadacha19 {

	public static void main(String[] args) {
		// define and initialize num, and previous number
		int num = 0;
		int previous = 0;
				
		// input stream
		Scanner sc = new Scanner(System.in);
			
		// enter num1 and validate the input
		System.out.println("Enter num in the range [10..99]:");
		num = sc.nextInt();
		while( num < 10 || num > 99){
			System.out.println("Invalid input. Enter new value [10..99]");
			num = sc.nextInt();
		}
		
		// assing num to previous number
		previous = num;

		// until num = 1, print the sequence
		while(num != 1){
			if(previous % 2 == 1){
				num = 3 * num + 1;
				System.out.print(num + " ");
				previous = num;
			} 
			else {
				num = num / 2 ;
				System.out.print(num + " ");
				previous = num;
			}
		}
		
	}
}