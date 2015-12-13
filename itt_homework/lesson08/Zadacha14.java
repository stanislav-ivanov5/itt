package lesson08;

import java.util.Scanner;

/**
 * Да се състави метод, който приема за стойност число N и връща 
 * стойността на N! (N факториел)
 *
 */
public class Zadacha14 {

	// factorial method checking for both positive and negative numbers
	static double fact(int n){
		if ( n == 0 || n == 1){
			return 1;
		}
		return (n > 0) ? (n* fact(n - 1)) : ((fact(n + 1) / n)) ;
	}
	
	// print method
	static void printFact(int n){
		System.out.println(fact(n));
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// validate input
		while(!sc.hasNextInt()){
			System.out.println("Invalid input. ");
			sc.next();
		}
		int n = sc.nextInt();
		
		sc.close();
		
		// method call
		fact(n);
		printFact(n);
		
	}
}
