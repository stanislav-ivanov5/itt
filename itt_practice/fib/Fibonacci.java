package fib;

import java.util.Scanner;

public class Fibonacci {

	static void fib(int n) {
		if (n <= 0) {
			return;
		}
		if (n == 1 || n == 2) {
			int num = 1;
			System.out.println(num);
		}
		if (n > 2) {
			long prev = 1;
			long curr = 1;
			long next = prev + curr;

			for (int i = 3; i < n; i++) {
				prev = curr;
				curr = next;
				next = prev + curr;
			}
			System.out.println(next);
		}
	}
	
	
	static int validateInput(){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n: ");

		while (!sc.hasNextInt()) {
			sc.next();
		} 
		
		int n = sc.nextInt();
		sc.close();
		
		return n;
	}
	

	public static void main(String[] args) {

		fib(validateInput());
		
	}
}
