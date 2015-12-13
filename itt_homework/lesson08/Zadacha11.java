package lesson08;

/**
 * Да се създаде метод, който отпечатва масив в конзолата
 *
 */
public class Zadacha11 {

	// print array iterating over its elements
	static void printArr(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// initialize array
		int[] arr = {5, 3, 2, 5, 6, -1};
		
		// function call
		printArr(arr);
	}
}
