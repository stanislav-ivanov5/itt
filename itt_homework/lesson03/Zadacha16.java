package lesson03;

import java.util.Scanner;

/**
 * Да се състави програма, чрез която се въвеждат 2 естествени числа N, M от
 * интервала [10..5555]. Програмата, чрез цикъл for, да извежда всички числа от
 * интервала, които са кратни на 50 в низходящ ред. Пример: 25,249 Изход:
 * 200,150,100, 50.
 *
 */
public class Zadacha16 {

	public static void main(String[] args) {
		// define and initialize both numbers n and m
		int n = 0, m = 0;
		Scanner sc = new Scanner(System.in);

		// input n and validate the input
		System.out.println("Enter n:");
		n = sc.nextInt();
		while ((n < 10) || (n > 5555)) {
			System.out.println("Invalid input. Enter new value n:");
			n = sc.nextInt();
		}
		// input m and validate the input
		System.out.println("Enter m:");
		m = sc.nextInt();
		while ((m < 10) || (m > 5555)) {
			System.out.println("Invalid input. Enter new value m:");
			m = sc.nextInt();
		}
		
		// switch the values of n and m
		if(n > m){
			int temp;
			temp = n; 
			n = m;
			m = temp;
		}
		
		// print the numbers in the range [n, m] divisible by 50  
		for(int i = m; i >= n; i--){
			if(i % 50 == 0){
				System.out.print(i + " ");
			}
		}
	}
}
