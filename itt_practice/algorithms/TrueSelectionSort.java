package algorithms;

import java.util.Arrays;

public class TrueSelectionSort {

	static void selectionSort(int[] a){
		
		for(int i = 1; i < a.length; i++){
			int maxIndex = 0;
			
			for(int j = 0; j <= a.length - i; j++){
				if(a[j] > maxIndex){
					maxIndex = j;
				}
			}
			
			int temp = a[maxIndex];
			a[maxIndex] = a[a.length - i];
			a[a.length - i] = temp;
		}
	}

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 1, 2, 7, 12};
		selectionSort(a);
		
		System.out.println(Arrays.toString(a));
	}
}
