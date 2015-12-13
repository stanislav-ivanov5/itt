package lesson05_simple_tasks;

/*
 * 1 5 9 13 17 
 * 2 6 10 14 18 
 * 3 7 11 15 19 
 * 4 8 12 16 20 

 */

public class T11_2 {

	public static void main(String[] args) {
		
		int rows = 4;
		int cols = 5;

		int num = 1;

		int[][] arr = new int[rows][cols];
		
		for(int c = 0; c < arr[0].length; c++){
			for(int r = 0; r < arr.length; r++){
				arr[r][c] = num++;
			}
		}
		
		for(int r = 0; r < arr.length; r++){
			for(int c = 0; c < arr[0].length; c++){
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
}
