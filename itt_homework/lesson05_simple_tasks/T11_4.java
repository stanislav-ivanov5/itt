package lesson05_simple_tasks;

/*
 * 1 8 9 16 17 
 * 2 7 10 15 18 
 * 3 6 11 14 19 
 * 4 5 12 13 20 
 */

public class T11_4 {

	public static void main(String[] args) {
		
		int rows = 4;
		int cols = 5;

		int num = 1;

		int[][] arr = new int[rows][cols];
		
		for(int c = 0; c < arr[0].length; c++){
			for(int r = 0; r < arr.length; r++){
				if(c % 2 == 0){
					arr[r][c] = num;
				}
				else {
					arr[arr.length - r - 1][c] = num;
				}
				num++;
			}
		}
		
		for(int r = 0; r < rows; r++){
			for(int c = 0; c < cols; c++){
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}
}
