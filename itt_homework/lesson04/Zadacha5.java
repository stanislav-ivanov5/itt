package lesson04;

/**
 * Напишете програма, която създава масив с 10 елемента и 
 * инициализира всеки от елементите със стойност, равна на индекса на 
 * елемента, умножен по 3. 
 * Да се изведат елементите на екрана.
 *
 */

public class Zadacha5 {

	public static void main(String[] args) {
		
		// initialize array with 10 elements
		int[] array = new int[10];
		
		// fill array cells with values
		for(int i = 0; i < array.length; i++){
			array[i] = i*3;
		}
		
		// print the values
		for(int i = 0; i < array.length; i++){
			System.out.println("array[" + i + "] \t" + array[i]);
		}
	}
}
