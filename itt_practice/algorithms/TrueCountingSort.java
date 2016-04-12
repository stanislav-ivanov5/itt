package algorithms;

import java.util.Arrays;

public class TrueCountingSort {

	static int[] countingSort(int[] nums){
		
		int maxNum = nums[0];
		for(int i = 0; i < nums.length; i++){
			if(nums[i] > maxNum){
				maxNum = nums[i];
			}
		}
		
		int[] numbersCount = new int[maxNum + 1];
		
		int[] result = new int[nums.length];
		
		for(int index = 0; index < nums.length; index++){
			int num = nums[index];
			
			numbersCount[num]++;
		}
		
		for(int index = 1; index < numbersCount.length; index++){
			numbersCount[index] += numbersCount[index - 1]; 
		}
		
		for(int index = 0; index < nums.length; index++){
			int num = nums[index];
			numbersCount[num]--;
			int position = numbersCount[num];
			result[position] = num;
			
			System.out.println("num " +  num + " nums[index] " + nums[index] 
					+ " numbersCount[num]" + numbersCount[num] 
					+ " position " + position  
					+ " result[position] " + result[position]);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] a = {3, 3, 1, 1, 0, 2};
		int[] b = countingSort(a);
		
		System.out.println(Arrays.toString(b));
	}
}
