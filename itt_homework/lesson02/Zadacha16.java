package lesson02;

import java.util.Scanner;

/**
 * 	Въведено е трицифрено естествено число от вида abc.
	Трябва да се провери дали:
	ако a = b = c - Изход: цифрите са равни;
	ако a>b>c - Изход: цифрите са във възходящ ред;
	ако a<b<c цифрите са в низходящ ред;
	и изход: цифрите са ненаредени, за неописаните случаи.
	Да се състави програма, която извежда резултата от проверката за
	наредба на цифрите в числото.
	Пример: 345
	Изход: възходящ ред.

 *
 */

public class Zadacha16 {

	public static void main(String[] args){
		
		// define and initialize variables for number and three digits 
		int threeDigitNumber = 0;
		int digitA = 0, digitB = 0, digitC = 0;
		
		// open an input stream and input the number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three digit number:");
		threeDigitNumber = sc.nextInt();
		
		// validate the input
		while((threeDigitNumber < 100) || (threeDigitNumber > 999) ){
			System.out.println("Invalid input. Enter new number:");
			threeDigitNumber = sc.nextInt();
		}
		
		// close the input stream
		sc.close();
		
		// calculate the three digits
		digitC = threeDigitNumber % 10;
		digitB = (threeDigitNumber / 10) % 10;
		digitA = (threeDigitNumber / 100) % 10;
		
		// check whether the digits of the number are sorted in any order
		if((digitA == digitB) && (digitA == digitC) ){
			System.out.println("Цифрите са равни");
		} else if ((digitA > digitB) && (digitB > digitC)){
			System.out.println("Цифрите са в низходящ ред");
		} else if ((digitA < digitB) && (digitB < digitC)){
			System.out.println("Цифрите са във възходящ ред");
		} else {
			System.out.println("Цифрите са ненаредени");
		}
	}
}
