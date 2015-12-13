package glava16_variables;
// prints True if user enters 5 consistent True

import java.util.Scanner;

public class Zad10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int counts = 0;
		boolean isTrue = false;

		while( counts < 5){
			isTrue = sc.nextBoolean();
			if(isTrue){
				counts++;				
			}
			else {
				counts = 0;
			}
		}
		if(counts == 5){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}
