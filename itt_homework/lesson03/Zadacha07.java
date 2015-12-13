package lesson03;

import java.util.Scanner;

/**
 * Започвайки от 3, да се изведат на екрана първите n числа които се делят на 3.
 * Числата да са разделени със запетая.
 *
 */
public class Zadacha07 {

	public static void main(String[] args) {

		// define and initialize number
		int n = 0;

		// open input stream
		Scanner sc = new Scanner(System.in);

		// input n for numbers count needed  
		System.out.println("Enter n: ");
		n = sc.nextInt();
		while(n < 3){
			System.out.println("Invalid input. Enter new value: ");
			n = sc.nextInt();
		}
		
		// define and initialize counter for numbers divisible by 3
		int counter = 0;

		// find each number divisible by 3 and print all the numbers
		for(int i = 3; i <= n * 3; i++){
			if(i % 3 == 0){
				System.out.print(i);
				if(counter < (n - 1)){
					System.out.print(",");
				}
				counter++;
			}
			if(counter == n){
				break;
			}
		}
		
	}
}
