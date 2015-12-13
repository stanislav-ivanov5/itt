package glava07_2d_arrays;

// matrix, prints number which appears max times in the array
public class Zad01 {

	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 2, 3, 2, 2 }, 
				{ 3, 2, 4, 3, 2 }, 
				{ 7, 8, 6, 5, 7 } 
		};

		int count = 0;
		int num = arr[0][1];
		int maxCount = 0;

		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[0].length; y++) {
				count = 0;
				num  = arr[x][y];
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[0].length; j++) {
						if (arr[i][j] == num) {
							count++;
						}
						if(count > maxCount){
							maxCount = count;
						}
					}
				}
			}
		}
		
		System.out.println(maxCount);

	}
}
