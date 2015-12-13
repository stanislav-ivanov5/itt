package glava04_if;

import java.util.Scanner;

// read 3 numbers, say if 2nd is between the other 2

public class Zad02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a > b && a < c){
			System.out.println(a);
		}
		else {
			if(b > a && b < c){
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
	}
}
