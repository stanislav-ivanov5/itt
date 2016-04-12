package algorithms;

import java.util.Arrays;

public class TrueQuickSort {

	
	static void swap(int[] a, int x, int y){
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	
	
	static int partition(int[] a, int left, int right){
		
		int pivot = a[right];
		
		int k = left - 1;
		
		for(int index = left; index <= right; index++){
			if(a[index] <= pivot){
				
				k++;
				swap(a, k, index);
			}
		}
		
		return k;
	}
	
	
	static void quickSort(int[] a, int left, int right){
		
		if(left >= right){
			return;
		}
		
		int k = partition(a, left, right);
		
		quickSort(a, left, k-1);
		quickSort(a, k+1, right);
	}
	
	
	public static void main(String[] args) {
		
		int[] a = new int[]{3213, 1322, 123, 221, 9731, 233, 234, 
				241, 254, 261, 239, 92, 23, 9, 85181};
		
		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}
