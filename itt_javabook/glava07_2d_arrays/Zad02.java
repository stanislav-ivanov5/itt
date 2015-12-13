package glava07_2d_arrays;

// prints diagonals of square matrix
public class Zad02 {

	public static void main(String[] args) {
		
		int[][] arr = {
				{1, 2, 3, 4},
				{3, 4, 5, 6},
				{6, 4, 3, 2},
				{4, 3, 1, 1},
		};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + " ");
		}
		System.out.println("\n****************");
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			System.out.print(arr[i][j] + " ");
		}
		
	}
}
