package lesson03;

import java.util.Scanner;

/**
 * 	Да се прочете число от екрана(конзолата) и да се 
	изведе сбора на всички числа между 1 и въведеното число.
 *
 */

public class Zadacha06 {
	
	public static void main(String[] args) {
		// define and initialize a number and variable for sumation
		int num1 = 0;
		
		int result = 0;
		
		Scanner sc = new Scanner(System.in);

		// enter value for num1
		System.out.print("Enter number: ");
		num1 = sc.nextInt();
		
		// check whether the entered number is >, < or 0 and sum the numbers between 1 and num1
		if(num1 > 0){
			for(int i = 1; i <= num1; i++){
				result += i;
			}			
		} 
		else {
			for(int i = num1; i <= 1; i++){
				result += i;
			}
		}
		// print the result
		System.out.println(result);
	}
}
