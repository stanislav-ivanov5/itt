package glava05_cycles;

import java.util.Scanner;

// prime number
public class Zad04 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int n = 0; 
		n = sc.nextInt();
		
		boolean flag = true;
		
		for(int i = 2; i < n; i++){
			if(n % i == 0){
				flag = false;
				break;
			}
		}
		
		if(flag){
			System.out.println("prime");
		}
		else{
			System.out.println("not prime");
		}
	}
}
