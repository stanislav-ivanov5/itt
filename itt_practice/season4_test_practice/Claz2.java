package season4_test_practice;

import java.util.Arrays;
import java.util.Scanner;

// read infinite 0, 1, 1, 0, 0, 
// tells which is more 0s or 1s

public class Claz2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		
		for (int i = 0; i < 5; i++) {
			
			int num = sc.nextInt();
			
			if(num == 1){
				arr[1]++;
			}
			else {
				arr[0]++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
			
		
		
	}
}
