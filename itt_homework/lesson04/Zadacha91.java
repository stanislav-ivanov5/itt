package lesson04;

public class Zadacha91 {

	public static void main(String[] args) {
		
		// initialize array A
		int[] arrA = new int[]{0, 1, -5, 5, 5};
		
		// initialize array B with length of arrA
		int[] arrB = new int[arrA.length];
		
		// initialize counter j, assign to it last element of arrB
		int j = arrB.length - 1;
		
		// first element of A = last element of B
		for(int i = 0; i < arrA.length; i++){
			arrB[j] = arrA[i];
			j--;
		}
		
		// print arrB (reverse of arrA)
		for(int i = 0; i < arrB.length; i++){
			System.out.printf("arr[%d] \t %d\n", i, arrB[i] );
		}
	}
}
