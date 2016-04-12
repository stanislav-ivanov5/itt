package season4_test_practice;

import java.util.Arrays;

// 100 000 elements unsorted in array
// there are 2 equal elements, finds them

public class Claz5 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[100_000];
		
		int num = 0;
		
		for(int i = 0; i < arr1.length; i++){
			arr1[i] = num;
			num++;
		}
		
		long start = System.currentTimeMillis();

		
		
		System.out.println(Arrays.toString(arr1));
		
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println(time);
		
	}
}
