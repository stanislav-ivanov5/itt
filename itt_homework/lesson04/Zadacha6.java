package lesson04;

import java.util.Scanner;

/**
 * Напишете програма, която първо чете 2 масива и после извежда 
 * съобщение дали са еднакви, и дали са с еднакъв размер
 *
 */

public class Zadacha6 {

	public static void main(String[] args) {
		
		int aLength = 0, bLength = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter arrayA length: ");
		aLength = sc.nextInt();
		while(aLength <= 1){
			System.out.println("Invalid input. Enter new length: ");
			aLength = sc.nextInt();
		}
		
		System.out.println("Enter arrayB length: ");
		bLength = sc.nextInt();
		while(bLength <= 1){
			System.out.println("Invalid input. Enter new length: ");
			bLength = sc.nextInt();
		}
		
		// initialize both arrays
		int[] arrA = new int[aLength];
		int[] arrB = new int[bLength];
		
		// input array A elements
		System.out.println("Enter array A elements: ");
		for(int i = 0; i < arrA.length; i++){
			arrA[i] = sc.nextInt();
		}
		
		// input array B elements
		System.out.println("Enter array B elements: ");
		for(int i = 0; i < arrB.length; i++){
			arrB[i] = sc.nextInt();
		}
		
		sc.close();

		// check for different array lengths 
		if(arrA.length != arrB.length){
			System.out.println("Arrays are not equal. \n"
					+ "Their lengths are not equal as well");
		}
		
		// declare a flag, to show whether arrays are equal
		boolean flag = false;
		
		// when length is equal, check the elements of both arrays for equality 
		if(arrA.length == arrB.length){
			System.out.println("Equal length");
			for(int i = 0; i < arrA.length; i++){
				if(arrA[i] != arrB[i]){
					flag = false;
					break;
				}
				else {
					flag = true;
				}
			}
		}
		
		// print the result
		if(flag == true){
			System.out.println("Equal arrays");
		}
		else {
			System.out.println("Not equal arrays");
		}
		
	}
}
