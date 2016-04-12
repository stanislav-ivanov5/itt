package scanner_next_issues;

import java.util.Scanner;

public class ScannerNextIssue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter next of kin: ");
		String kin = sc.nextLine();
		
		System.out.println("age: " + age + "\n kin " + kin);
		
		sc.close();
		
		
	}
}
