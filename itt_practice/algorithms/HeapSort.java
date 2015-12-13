package algorithms;

public class HeapSort {

	private static int N; // count of array elements  
	
	public static void main(String[] args) {
		
		int[] arr = {9,13,11,4,28,75,5,26,1};
		sort(arr);
		System.out.println("\nElements after sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static void sort(int[] arr){
		heapify(arr);
		for (int i = N; i >= 0 ; i--) {
			swap(arr, 0, i);
			N = N - 1;
			downHeap(arr, 0);
		}
	}
	
	static void heapify(int[] arr){
		N = arr.length - 1;
		for (int i = N / 2; i >= 0; i--) {
			downHeap(arr, i);
		}
	}
	
	static void downHeap(int[] arr, int i){
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		int max = i;
		if(left <= N && arr[left] > arr[i]){
			max = left;
		}
		if(right <= N && arr[right] > arr[max] ){
			max = right;
		}
		
		if(max != i){
			swap(arr, i, max);
			downHeap(arr, max);
		}
		
	}
	
	static void swap(int arr[], int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
