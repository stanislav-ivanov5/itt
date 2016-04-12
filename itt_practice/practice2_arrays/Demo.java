import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int[][] a = new int[rows][cols];
		int num = 1;
		
		for (int row = 0; row < rows; row++) {
			int r = row;
			int c = 0;
			while (r >= 0 && c < cols) {
				a[r][c] = num;
				r--;
				c++;
				num++;
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
