package lesson05_simple_tasks;

/**
 * Едномерен масив наричаме назъбен, ако всеки елемент в
 * масива е > от предишния и < от следващия. 
 * Напишете програма, която проверява дали даден масив от числа е 
 * назъбен.
 *
 */

public class T2 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 3, 2, 4, 2, 5};
		
		boolean isZigzag = false;
		
		for(int i = 1; i < arr.length - 2; i++){
			if((arr[i] > arr[i-1] && arr[i] > arr[i+1]) || 
					(arr[i] < arr[i-1] && arr[i] < arr[i+1])){
				isZigzag = true;
			}
		}
		
		if(isZigzag){
			System.out.println("zigzag");
		}
		else {
			System.out.println("not zigzag");
		}
	}
}
