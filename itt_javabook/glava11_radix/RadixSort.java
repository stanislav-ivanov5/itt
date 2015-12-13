package glava11_radix;

import java.util.Arrays;

public class RadixSort {

	static int kthDigit(int num, int k){
		
		int tenOnKth = (int) Math.pow(10, k-1);
		
		return (num / tenOnKth) % 10;
	}
	
	static int[] countingSort(int[] nums, int digit){
		
		int[] numbersCount = new int[10];
		
		int[] result = new int[nums.length];
		
		for(int index = 0; index < nums.length; index++){
			int num = kthDigit(nums[index], digit);
			
			numbersCount[num]++;
		}
		
		for(int index = 1; index < numbersCount.length; index++){
			
			numbersCount[index] += numbersCount[index - 1]; 
		}
		
		for(int index = nums.length - 1; index >= 0; index--){
			
			int num = nums[index];
			
			int numDigit = kthDigit(num, digit);
			
			numbersCount[numDigit]--;
			
			int pos = numbersCount[numDigit];
			
			result[pos] = num;
		}
		
		return result;
	}
	
	
	static int getMaxNum(int nums[]){
		
		int max = nums[0];
		
		for(int index = 1; index < nums.length; index++){
			if(nums[index] > max){
				max = nums[index]; 
			}
		}
		
		return max;
	}
	
	
	static int getNumOfDigits(int num){
		int digitCount = 0;
		
		while(num > 0){
			num /= 10;
			digitCount++;
		}
		
		return digitCount;
	}
	
	static int[] radixSort(int[] nums){
		
		int maxDigits = getNumOfDigits(getMaxNum(nums));
		
		for(int digit = 1; digit < nums.length; digit++){
			nums = countingSort(nums, digit);
		}
		
		return nums;
	}
	
	
	public static void main(String[] args) {
		
		int[] result = radixSort(new int[]{3213, 1322,
				123, 221, 9731, 233, 92, 23, 9, 85181});
		
		System.out.println(Arrays.toString(result));
	}
	
}
