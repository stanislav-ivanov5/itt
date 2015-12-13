package glava02_variables;

import java.util.Scanner;

// tells if 3 sides can form a triangle
public class Upr04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		boolean formTriangle = (a + b) > c && (b + c) > a && (a + c ) > b;
		
		if(formTriangle){
			System.out.println("Three sides can form a triangle.");
		}
		else {
			System.out.println("Cannot form a triangle.");
		}
	}
}
