package algorithms;

import java.util.Arrays;

public class TrueBinarySearch {

	static int binarySearch(int[] a, int x, int start, int end){
		
		int mid = (end + start) / 2 ;
		
		if(start > end){
			return -1;
		}
		
		if(x == a[mid]){
			return mid;
		}
		
		if(x < a[mid]){
			return binarySearch(a, x, start, mid-1);
		}
		else{
			if(x > a[mid]){
				return binarySearch(a, x, mid+ 1, end);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		int x = 7;
		
		System.out.println(Arrays.toString(a));
		int index = binarySearch(a, x, 0, a.length-1);
		
		System.out.println(index);
	}
}
