package lesson04;

import java.util.Scanner;

/**
 * Една редица от естествени числа ще наричаме зигзагообразна нагоре, 
 * ако за елементите и са изпълняват условията: 
 * N1 < N2 > N3 < N4 > N5 <..
 * Съставете програма, която проверява дали въведени в едномерен 
 * масив редица от числа изпълняват горните изисквания.
 * 
 * Пример: 1 3 2 4 3 7
 * Изход: изпълнява изискванията за зигзагообразна нагоре редица
 *
 */

public class Zadacha17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// input array length
		System.out.println("Enter array length: ");
		int arrLength = sc.nextInt();
		
		// initialize array
		int[] arr = new int[arrLength];
		
		// enter array elements
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}

		// flag variable for zigzag
		boolean isZigzag = true;
		
		// check if the sequence meet the requirements
		for(int i = 1; i < arr.length - 1; i++){
			boolean isBigger = ((arr[i] > arr[i - 1]) || (arr[i] > arr[i + 1]));
			boolean isLess = ((arr[i] < arr[i - 1]) || (arr[i] < arr[i + 1]));
			boolean upSequence = (arr[0] < arr[1]) ? true : false;
			
			if(!(upSequence && (isBigger || isLess))){
				isZigzag = false;
				break;
			}
		}
		
		// print result
		if(isZigzag){
			System.out.println("Upward zigzag sequence");
		}
		else {
			System.out.println("Not upward zigzag sequence");
		}

	}
}
