package glava02_variables;

import java.util.Scanner;

// circle area
public class Upr02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int radius = sc.nextInt();
		
		double S = 3.14*radius*radius;
		
		System.out.println(S);
	}
}
