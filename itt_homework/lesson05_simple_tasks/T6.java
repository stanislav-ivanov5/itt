package lesson05_simple_tasks;

/**
 * Напишете програма, която за дадена матрица от символи 
 * отпечатва на екрана елементите, които се намират на главния 
 * диагонал
 *
 */

public class T6 {

	public static void main(String[] args) {
		
		char[][] arr = new char[][]{
				{'c', 'a', 'b', 'f'},
				{'n', 'm', 'o', 'o'},
				{'5', '5', '3', 'i'},
		};
		
		int j = 0;
		
		// print diagonal
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i][j]);
			j++;
		}
	}
}
