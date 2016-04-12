
public class SubMatrixSumTask {
	public static void main(String[] args) {
		int[][] a = { { 3, 1, 2, 5, 9 }, { 1, 1, 2, 5, 2 }, { 8, 6, 0, 7, 7 },
				{ 2, 10, 11, -5, 6 },
				{ 7, 21, 11, 2, 8 }, { 4, 9, 2, 5, 3 } };
		
		int max = a[0][0] + a[0][1] + a[1][0] + a[1][1];
		int maxR = 0;
		int maxC = 0;
		
		for (int row = 0; row <= a.length-2; row++ ) {
			for (int col = 0; col <= a[0].length-2; col++) {
				int sum = a[row][col] + a[row+1][col] +  a[row][col+1] + a[row+1][col+1];
				
				if (sum > max) {
					max = sum;
					
					maxR = row;
					maxC = col;
				}
			}
		}
		
		System.out.println("Maximum 2x2 sum is : " + max);
//		System.out.println(a[maxR][maxC] + " " + a[maxR][maxC+1]);
//		System.out.print(a[maxR+1][maxC] + " " + a[maxR+1][maxC+1]);
		
		for (int row=maxR; row <= maxR+1; row++) {
			for (int col=maxC; col <= maxC+1; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
 	}
}
