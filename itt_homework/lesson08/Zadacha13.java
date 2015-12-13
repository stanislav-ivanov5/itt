package lesson08;
/**
 * Да се създаде метод, който приема два масива от числа и връща 
 * масив, съдържащ всички елементи на подадените масиви, 
 * като в първата част на масива са елементите на първия подаден масив, 
 * а във втората част – тези на втория подаден масив
 *
 */
public class Zadacha13 {

	// create new array with length = length of initially created arrays
	// return the big array 
	static int[] arrBuilder(int[] arr1, int[] arr2) {
		int[] bigArr = new int[arr1.length + arr2.length]; 
		
		for(int i = 0; i < arr1.length; i++){
			bigArr[i] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++){
			bigArr[arr1.length + i] = arr2[i];
		}
		
		return bigArr;
	}
	
	// print array method
	static void printArr(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1){
				System.out.print(", ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		// initialize two arrays of int[]
		int[] arr1 = {5, 2, 4, 5, -6, 10};
		int[] arr2 = {5, 2, 4, 5, -6, 10, 15, 20, 25, 50};
		
		arrBuilder(arr1, arr2);

		// print the big array
		printArr(arrBuilder(arr1, arr2));
	}

	
}
