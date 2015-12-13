package lesson08;

import java.util.Scanner;
/**
 * Да се създаде метод, който приема за входни данни число N и 
 * връща масив от числа с дължина N, който съдържа всички числа от 1 до N
 *
 */
public class Zadacha12 {

	// method for filling array with numbers from 1 to n
	// return array
	static int[] arrFiller(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}

	// print array method
	static void printArr(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		// validate input for n, must be positive number
		do{
			System.out.println("Please enter a positive number: ");
			while(!sc.hasNextInt()){
				System.out.println("Invalid input. Enter new value: ");
				sc.next();
			}
			n = sc.nextInt();
		} while (n <= 0);

		sc.close();
		
		// method call
		printArr(arrFiller(n));
		
	}
}
