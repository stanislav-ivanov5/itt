package lesson08;

import java.util.Scanner;

/**
 * Да се състави програма, чрез която се въвеждат два низа съдържащи 
 * до 40 главни и малки букви.
 * Като резултат на екрана да се извеждат низовете само с главни и само
 * с малки букви.
 * Пример: Abcd Efgh
 * Изход: ABCD abcd EFGH efgh
 *
 */

public class Zadacha1 {

	public static void main(String[] args) {
		
		// initialize two string variables
		String str1 = "";
		String str2 = "";
		
		Scanner sc = new Scanner(System.in);
		
		// prompt user to input the strings  
		System.out.println("Enter string 1: ");
		str1 = sc.nextLine();
		System.out.println("Enter string 2: ");
		str2 = sc.nextLine();

		// validate string lengths
		while((str1.length() + str2.length()) >= 40){
			System.out.println("Enter string 1: ");
			str1 = sc.nextLine();
			System.out.println("Enter string 2: ");
			str2 = sc.nextLine();
		}
		
		// store upper case letters in first strings
		str1 = str1.toUpperCase();
		str2 = str2.toUpperCase();
		
		// new string variables for lower case letters
		String str3 = str1.toLowerCase();
		String str4 = str2.toLowerCase();
		
		// print result
		System.out.println(str1 + " " + str3 + " " + str2 + " " + str4);
		
		// close input stream
		sc.close();
	}
}
