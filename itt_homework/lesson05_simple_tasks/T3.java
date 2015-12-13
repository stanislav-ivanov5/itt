package lesson05_simple_tasks;

import java.util.Scanner;

/**
 * Напишете програма, която за даден масив от символи arr
 * и символ ch, въведен от потребителя, проверява dали arr съдържа ch.
 * Ако се съдържа, отпечатайте индекса на елемента. Ако не, 
 * отпечатайте подходящо избрана от вас стойност
 *
 */

public class T3 {

	public static void main(String[] args) {
		
		char[] arr = new char[]{'f', 'r', 'd'};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char: ");
		
		char ch = sc.next().charAt(0);
		
		int where = 0;
		boolean containChar = false;
		
		for(int i = 0; i < arr.length; i++){
			if(ch == arr[i]){
				where = i;
				containChar = true;
			}			
		}
		
		if(containChar == true){
			System.out.println("At index " + where);
		}
		else {
			System.out.println("Doesn't contain char");
		}
	}
}
