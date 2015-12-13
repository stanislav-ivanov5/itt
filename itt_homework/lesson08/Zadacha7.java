package lesson08;

import java.util.Scanner;

/**
 * Да се състави програма, която чете набор от думи разделени с интервал.
 * Като резултат да се извеждат броя на въведените думи, както и броя 
 * знаци в най-дългата дума.
 * Пример: asd fg hjkl
 * Изход: 3 думи, най-дългата е с 4 символа.
 *
 */
public class Zadacha7 {

	public static void main(String[] args) {
		
		// enter a string with nextLine
		Scanner sc = new Scanner(System.in);
		String strLine = sc.nextLine();
		
		// split the string and save it in an array
		String[] strArr = strLine.split(" ");
		
		// print the number of words
		System.out.println(strArr.length + " words, ");
		
		int maxLength = 0;
		
		// find the max length of all array elements
		for(int i = 0; i < strArr.length; i++){
			if(strArr[i].length() > maxLength){
				maxLength = strArr[i].length();
			}
		}
		
		// print result
		System.out.printf("The one with longest length is with: "
				+ "%d symbols", maxLength);
	}
}
