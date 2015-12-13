package lesson02;

import java.util.Scanner;

/**
 * 	Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
	3 литра и ги ползвате едновременно.
	Да се състави програма, която по даден обем извежда как ще прелеете
	течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
	кофите. Кофите не могат да се ползват с частично количество вода.
	Входни данни: естествено число от интервала [10..9999].
	Пример: 107
	Изход: 21 пъти по 2 литра,
 	21 пъти по 3 литра
 	допълнително кофа от 2 литра
 *
 */

public class Zadacha10 {
	// define constants for buckets capacity
	public static final int BUCKET_ONE = 2;
	public static final int BUCKET_TWO = 3;

	public static void main(String[] args) {
		// define variables for cistern capacity and counter for how many times
		// the buckets are used
		int cistern = 0;
		int counter = 0;
		
		// input the cistern capacity
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter cistern capacity [10..9999]: ");
		cistern = sc.nextInt();
		
		// count how many times the capacity of both buckets is used to fill the
		// cistern
		counter = cistern / 5;
		int remainder = cistern % 5;
		
		switch (remainder) {
		case 0:
			System.out.printf("%d times %d litres, %n%d times %d litres %n",
					counter, BUCKET_ONE, counter, BUCKET_TWO);
			break;
		case 1:
			--counter;
			System.out.printf("Scenario One: %n%d times %d litres, %n"
					+ "%d times %d litres %n further 3 buckets of 2 litres %n",
					counter, BUCKET_ONE, counter, BUCKET_TWO);
			System.out.printf("Scenario Two: %n%d times %d litres, %n"
					+ "%d times %d litres %n further 2 buckets of 3 litres",
					counter, BUCKET_ONE, counter, BUCKET_TWO);
			break;
		case 2:
			System.out
			.printf("%d times %d litres, %n%d times %d litres %n further bucket of 2 litres",
					counter, BUCKET_ONE, counter, BUCKET_TWO);
			break;
		case 3:
			System.out
			.printf("%d times %d litres, %n%d times %d litres %n further bucket of 3 litres",
					counter, BUCKET_ONE, counter, BUCKET_TWO);
			break;
		case 4:
			System.out
			.printf("%d times %d litres, %n%d times %d litres %n further 2 buckets of 2 litres",
					counter, BUCKET_ONE, counter, BUCKET_TWO);
			break;
		default:
			break;
		}
	
		
		// close the input stream
		sc.close();

	}
}
