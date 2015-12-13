package glava07_2d_arrays;

public class Zad03 {

	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 },  };

		int[][] arr2 = new int[arr[0].length][arr.length];
		
		for (int j = 0; j < arr[0].length; j++) {
			for (int i = 0; i < arr.length; i++) {
				arr2[j][i] = arr[arr.length - 1 - i][j];
			}
			System.out.println();
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
