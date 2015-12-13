package lesson03;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * 
 * Да се направи програма, която по дадено число N, да изчислява N!, т.е.
 * 1*2*3*4...*N. Пример: 5 Изход: 120 Използвайте цикъл do-while
 *
 */
public class Zadacha25 {

	public static void main(String[] args) {

		int num = 0;

		// input a number
		System.out.println("Enter n: ");

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		// validate input, factorial can hold small values ( 20! at most )  
		while (num <= 0 || num > 20) {
			System.out.println("Invalid input. Enter new N: ");
			num = sc.nextInt();
		}

		long factorial = 1L;
		int i = 1;
		
		do{
			factorial *= i;
			i++;
		}
		while(i <= num);
		
		System.out.println(factorial);

	}

}
