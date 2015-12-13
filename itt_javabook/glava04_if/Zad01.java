package glava04_if;

import java.util.Scanner;

// READ 3 NUMBERS  and print the max

public class Zad01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a > c){
			System.out.println(a);
		}
		else {
			if(b > a && b > c){
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
	}
}
