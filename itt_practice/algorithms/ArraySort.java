package algorithms;

import java.util.Arrays;

public class ArraySort {


	public static void main(String[] args) {
		int[] array = {12, 3, 53, 6, 9, 3, 43, -4, 0};

		int[] array2 = {12, 3, 53, 6, 9, 3, 43, -4, 0};
		Arrays.sort(array);

		System.out.println(Arrays.equals(array, array2));
		
		for(int i = 0 ; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
}
