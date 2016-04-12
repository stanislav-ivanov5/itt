package algorithms;

import java.util.Arrays;

public class BubleSortMethod {

	public static int[] bubbleSort(int[] arr){
		
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		
		int[] newArr = {64, 25, 12, 11, 22};
		
		bubbleSort(newArr);
		
		System.out.println(Arrays.toString(newArr));
	}
}
