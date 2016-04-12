package methods;

import java.util.Arrays;

public class PassingByValue {

	public static void main(String[] args) {
		
		int[] nums = {2, 3, 4}; 
		System.out.println("predi metod " + Arrays.toString(nums));
		printNum(nums);
		System.out.println("sled metod " + Arrays.toString(nums));
		
	}
	
	static void printNum(int[] nums){
		nums[0] = 5;
		System.out.println("v metoda " + Arrays.toString(nums));
	}
}
