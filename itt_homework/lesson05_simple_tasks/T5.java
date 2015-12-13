package lesson05_simple_tasks;

/**
 * Напишете програма, която за дадена матрица m x n от числа
 * намира реда, в който сумата от елементите е максимална.
 *
 */

public class T5 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[][] {
				{3, 4, 5, 6},
				{2, 2, 2, 2},
				{4, 3, 2, 1},
		};
		
		// m rows; n cols
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		int maxRow = 0;	
		int currRow = 0;
		
		// define maxRow
		for(int i = 0; i < n; i++){
			maxRow += matrix[0][i];
		}
		
		System.out.println("Maxrow: " + maxRow);
		
		int where = 0; // find row with max sum
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				currRow += matrix[i][j];
				}
			if(currRow > maxRow){
				maxRow = currRow;
				where = i;
			}
			currRow = 0;
		}
		
		System.out.println("CurRow " + currRow);
		
		System.out.println("Row: " + where);
	}
}
