package algorithms;

import java.util.Arrays;

public class TrueBubbleSort {

	static void bubbleSort(int[] a){
		
		for(int i = 0; i < a.length; i++){
			boolean hasSwap = false;
			for(int j = 0; j < a.length - 1 - i; j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					hasSwap = true;
				}
			}
			if(!hasSwap){
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] a = {5, 3, 2, 7};
		
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
}
