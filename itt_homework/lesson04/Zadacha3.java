package lesson04;

import java.util.Scanner;

/**
 * Да се въведе число, след което да се създаде масив с 10 
 * елемента по следнис начин:
 * Първите 2 елемента на масива са въведеното число.
 * Всеки следващ елемент на масива е равен на сбора от 
 * предишните 2 елемента в масива.
 * След това изведете масива .
 *
 */
public class Zadacha3 {

	public static void main(String[] args) {
		
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// prompt user to input number
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		
		// initialize array with 10 elements
		int[] arr = new int[10];
		
		arr[0] = num;
		arr[1] = num;
		
		// assign numbers to all array members
		for(int i = 2; i < 10; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		// print array
		for(int i = 0 ; i< 10; i++){
			System.out.printf("arr[%d] \t %d \n", i, arr[i]);
		}
		
		sc.close();
	}
}
