package lesson05_simple_tasks;

/**
 * Напишете програма, която за дадена матрица намира 
 * произведението на елементите под главния диагонал
 *
 */

public class T7 {

	public static void main(String[] args) {
		
		int[][] arr = new int[][]{
				{5, 5, 7, 8},
				{1, 1, 2, 3},
				{4, 3, 2, 0},
		};
		
		// print diagonal
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i][i]);
		}
		
		int product = 1;
		
		// print elements below diagonal
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < i; j++){
				System.out.print(arr[i][j] + " ");
				product *= arr[i][j];
			}
		}
		
		System.out.println("\n Product: " + product);
	}
}
