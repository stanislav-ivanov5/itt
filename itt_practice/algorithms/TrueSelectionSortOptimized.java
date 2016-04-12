package algorithms;

import java.util.Arrays;

public class TrueSelectionSortOptimized {
	
	static void selectionSort(int[] a) {

		int start = 0;
		int end = a.length - 1;
		
		for (int i = 0; i < a.length / 2; i++) {
			
			int maxIndex = start;
			int minIndex = start;

			for (int j = start; j <= end; j++) {
				if (a[j] > a[maxIndex]) {
					maxIndex = j;
				}
				if(a[j] < a[minIndex]){
					minIndex = j;
				}
			}

			int temp = a[maxIndex];
			a[maxIndex] = a[end];
			a[end] = temp;
			
			if(minIndex == end){
//				System.out.println("***" + minIndex + " "+ a[minIndex] + 
//						" "+ maxIndex + " " + a[maxIndex]);
				minIndex = maxIndex;
			}
			
			temp = a[minIndex];
			a[minIndex] = a[start];
			a[start] = temp;
			
			end--;
			start++;
		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 1, 2, 7, 12, 0 };
		selectionSort(a);

		System.out.println(Arrays.toString(a));
	}
}
