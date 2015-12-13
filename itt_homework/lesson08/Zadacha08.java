package lesson08;

import java.util.Scanner;

public class Zadacha08 {

	public static void main(String[] args) {
		
		// input string
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		// initialize boolean variable to flag if the word is a palindrome
		boolean isPalindrome = true;
		
		// compare string letters from first and last to the meadian one
		for(int i = 0; i <= word.length() / 2; i++){
			if(word.charAt(i) != word.charAt(word.length() - 1 - i)){
				isPalindrome = false;
				break;
			}
		}
		
		// print result
		if(isPalindrome){
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
		sc.close();
	}
}
