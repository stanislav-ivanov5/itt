import java.util.Scanner;

public class Task11_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int[][] a = new int[rows][cols];
		int num = 1;

		for (int col = 0; col < cols; col++) {
			if (col % 2 == 0) {
				for (int row = 0; row < rows; row++) {
					a[row][col] = num++;
				}
			} else {
				for (int row = rows - 1; row >= 0; row--) {
					a[row][col] = num++;
				}
			}
		}
		
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[0].length; col++) {
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}

	}
}
