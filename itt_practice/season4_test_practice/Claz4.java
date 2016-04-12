package season4_test_practice;

import java.util.Scanner;

// convert lower case char to upper case char 
// -= 32
public class Claz4 {

	public static void main(String[] args) {

		char a = 'a';
		a -= 32;
		System.out.println(a);
		
		char b = 'b';
		b -= 32;
		
		System.out.println(b);
		
		Scanner sc = new Scanner(System.in);
		
		char character = sc.next().charAt(0);
		
		character -= 32;
		
		System.out.println(character);
	}
}
