package algorithms;

import java.util.Arrays;

public class HeapifyDemo {

	public static void main(String[] args) {
		
		int[] arr = {4, 23, 54, 2, -2, 67, 322, 234};
		
		heapify(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void heapify(int[] arr){
		for (int i = 0; i < arr.length - 1; i++) {
			downHeap(arr, i);
		}
	}
	
	static void downHeap(int[] arr, int index){
		
		int leftChild = 2 * index + 1;
		int rightChild = 2 * index + 2;
		
		int maxElement = index;
		
		if(leftChild < arr.length && arr[leftChild] > arr[maxElement]){
			maxElement = leftChild; 
		}
		
		if(rightChild < arr.length && arr[rightChild] > arr[maxElement]){
			maxElement = rightChild;
		}
		
		if(maxElement != index){
			int temp = arr[index];
			arr[index] = arr[maxElement];
			arr[maxElement] = temp;
			downHeap(arr, maxElement);
		}
	}
}
