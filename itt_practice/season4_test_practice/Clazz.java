package season4_test_practice;

import java.util.Scanner;

// reading infinite numbers 
// tell whether the num counts is even or odd

public class Clazz {

	public static void main(String[] args) {
		
		int currNum = 0;
		int num = 0;
		boolean isOdd = true;
		
		Scanner sc = new Scanner(System.in);
		while(true){
			num = sc.nextInt();
			isOdd = true;
			currNum = num;
			num = sc.nextInt();
			isOdd = false;
			currNum = num;
		}
	}
}
