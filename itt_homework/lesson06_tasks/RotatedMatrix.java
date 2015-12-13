package lesson06_tasks;

/**
 * Завъртаме двумерен масив на 90 градуса надясно
 *
 */

public class RotatedMatrix {

	public static void main(String[] args) {
		
		// initialize array
		int[][] arr = {
				{1, 2, 3},
				{5, 6, 7},
				{8, 9, 0},
				{10, 15, 20},
		};
		
		// print array in normal order
		int row = 0, col = 0;
		for(row = 0; row < arr.length; row++){
			for(col = 0; col < arr[0].length; col++){
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		System.out.println(" \n ************");

		// rotated print
		for(col = 0; col < 3; col++){
			for(row = 3; row > 0; row--){
				System.out.print(arr[row][col] + " ");
				if(row == 1){
					row--;
					System.out.print(arr[row][col] + " ");
				}
			}
			System.out.println();
		}
	}
}
