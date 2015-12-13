package glava05_cycles;

import java.util.Scanner;

// read a number, prints 1..n
public class Zad03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = 0; 
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.print(i + " ");
		}
	}
}
