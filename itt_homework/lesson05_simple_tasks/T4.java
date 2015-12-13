package lesson05_simple_tasks;

/**
 * Напишете програма, която сортира (подрежда елементите във 
 * възходящ ред) масив, съдържащ само 0 и 1
 *
 */

public class T4 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1, 0, 0, 1, 1, 0};
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(arr[j] > arr[i]){
					int temp = arr[j];
					arr[j] =  arr[i];
					arr[i] = temp;
				}				
			}
		}
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
