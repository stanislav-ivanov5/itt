package lesson04;

import java.util.Scanner;

/**
 * Напишете програма, която първо чете масив  и после създава нов 
 * масив със същия размер по следния начин: стойността на всеки 
 * елемент от втория масив да е равна на сбора от предходния и 
 * следващият елемент на съответния елемент от първия масив.
 * Да се изведе получения масив
 *
 */

public class Zadacha7 {

	public static void main(String[] args) {

		int arrLength = 0;

		// input array length
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array legnth: ");
		arrLength = sc.nextInt();
		
		// validate input
		while(arrLength < 1){
			System.out.println("Invalid input. arrLength [1..n]");
			arrLength = sc.nextInt();
		}
		
		// initialize two arrays
		int[] oldArr = new int[arrLength];
		int[] newArr = new int[arrLength];

		// read array elements
		System.out.println("Enter array elements: ");
		for (int i = 0; i < oldArr.length; i++) {
			oldArr[i] = sc.nextInt();
		}

		// first and last elements are equal
		newArr[0] = oldArr[0] + oldArr[arrLength - 1];
		newArr[arrLength - 1] = oldArr[0] + oldArr[arrLength - 1];

		// fill new array with values
		for (int i = 1; i < newArr.length - 1; i++) {
			newArr[i] = oldArr[i - 1] + oldArr[i + 1];
		}
		
		// print new array
		for (int i = 0; i < newArr.length; i++) {
			System.out.printf("newArr[%d] \t %d \n", i, newArr[i]);
		}
		
		sc.close();
	}
}
