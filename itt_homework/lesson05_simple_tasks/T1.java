package lesson05_simple_tasks;

/**
 * Напишете програма, която проверява дали в масив от цели 
 * числа всички числа са неотрицателни
 *
 */

public class T1 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{-5, -4, -2, -5, -0};
		
		boolean allNegative = true;
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > 0){
				allNegative = false;
				break;
			}
		}
		
		if(allNegative){
			System.out.println("All number are negative");
		}
		else {
			System.out.println("Not all number are negative");
		}
		
	}
}
