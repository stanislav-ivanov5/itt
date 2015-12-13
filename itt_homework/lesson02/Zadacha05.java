package lesson02;

import java.util.Scanner;

/**
 * 	Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
	ред.
 */

public class Zadacha05 {

	public static void main(String[] args) {

		// define and initialize a, b, c
		double a = 0, b = 0, c = 0;
		double smallest, middle, biggest;

		// input the numbers
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter A:");
		a = sc.nextDouble();

		System.out.println("Please enter B:");
		b = sc.nextDouble();

		// check if b is equal to a
		while (b == a) {
			System.out.println("b must not be equal to a. "
					+ "Please enter again value for b: ");
			b = sc.nextDouble();
		}

		System.out.println("Please enter C:");
		c = sc.nextDouble();

		// check if c is equal to a or b
		while ((c == a) || (c == b)) {
			System.out.println("c must not be equal to a, nor b. "
					+ "Please enter new value for c: ");
			c = sc.nextDouble();
		}

		// find the smallest number among the all numbers
		
		if( (a < b) && (a < c) ){
			if(b < c){
				System.out.printf("%f , %f , %f", a, b, c);
			} 
			else {
				System.out.printf("%f , %f , %f", a, c, b);
			}
		}
		else {
			if( (b < a) && (b < c) ){
				if(a < c){
					System.out.printf("%f , %f , %f", b, a, c);
				} 
				else {
					System.out.printf("%f , %f , %f", b, c, a);
				}
			}
		}
		if( (c < a) && (c < b) ){
			if(a < b){
				System.out.printf("%f , %f , %f", c, a, b);
			} 
			else {
				System.out.printf("%f , %f , %f", c, b, a);
			}
		}
	}
		
//		smallest = a;
//		if (smallest > b)
//			smallest = b;
//		if (smallest > c)
//			smallest = c;
//		// find the biggest number
//		biggest = a;
//		if (biggest < b)
//			biggest = b;
//		if (biggest < c)
//			biggest = c;
//		// find the middle number
//		middle = (a + b + c) - smallest - biggest;

		// print a, b and c in descending order
//		System.out.println(biggest + " " + middle + " " + smallest);

//		sc.close();
//}
}

