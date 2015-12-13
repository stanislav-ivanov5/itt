package lesson05_simple_tasks;
/*
 * 1 3 6 10 14 
 * 2 5 9 13 17 
 * 4 8 12 16 19 
 * 7 11 15 18 20 
 */


public class T11_3 {

	public static void main(String[] args) {
		int rows = 4;
		int cols = 5;

		int num = 1;

		int[][] arr = new int[rows][cols];


		for(int row = 0; row < rows; row++){
			int r = row;
			int c = 0;
			while (r >= 0 && c < cols) {
				arr[r][c] = num;
				r--;
				c++;
				num++;
			}
		}
		
		for(int col = 1; col < cols; col++){
			int row = rows - 1;
			int c = col;
			while (row >= 0 && c < cols) {
				arr[row][c] = num;
				row--;
				c++;
				num++;
			}
		}

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				System.out.print(arr[r][c] + " ");
				;
			}
			System.out.println();
		}

	}
}
