package lesson04;

/**
 * Дадени са два едномерни масива с естествени числа.
 * Да се състави програма, която сравнява всички числа с еднакви 
 * индекси от двата масива и записва в трети масив, по-голямото от 
 * двете числа.
 * 
 * Да се изведе съдържанието и на трите масива
 * 
 * Пример:
 * 18,19,32,1,3, 4, 5, 6, 7, 8
 * 1, 2, 3,4,5,16,17,18,27,11
 * 
 * Изход: 
 * 18,19,32 ,4,5,16,17,18,27,11
 *
 */

public class Zadacha18 {

	public static void main(String[] args) {
		
		// initialize two arrays
		int[] arrA = new int[]{18,19,32,1,3, 4, 5, 6, 7, 8};
		int[] arrB = new int[]{1, 2, 3,4,5,16,17,18,27,11};
		
		// initialize third array with length of the first ones
		int[] arrC = new int[arrA.length];
		
		// check if a number in A is bigger than number in B and store it in array C
		for(int i = 0; i < arrA.length; i++){
			int bigger = (arrA[i] > arrB[i]) ? arrA[i]: arrB[i];
			arrC[i] = bigger;
		}
		
		// print array A
		System.out.print("\n Array A: ");
		for(int i = 0; i < arrA.length; i++){
			System.out.print(arrA[i] + " ");
		}
		
		// print array B
		System.out.print("\n Array B: ");
		for(int i = 0; i < arrB.length; i++){
			System.out.print(arrB[i] + " ");
		}
		
		// print array C
		System.out.print("\n Array C: ");
		for(int i = 0; i < arrC.length; i++){
			System.out.print(arrC[i] + " ");
		}
	}
}
