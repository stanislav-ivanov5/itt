package lesson05_simple_tasks;

/*
 * Да се напише програма която изисква от потребителя да въведе
 * 2 числа n и m. След това да се построи матрица с размер n x m 
 * по следният начин (примерите са дадени за въведени n=4 и m=5)
 * 
 * 1 2 3 4 5 
 * 6 7 8 9 10 
 * 11 12 13 14 15 
 * 16 17 18 19 20
 */
public class T11_1 {

	public static void main(String[] args) {
		int rows = 4;
		int cols = 5;

		int num = 1;

		int[][] arr = new int[rows][cols];

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				arr[r][c] = num++;
			}
		}

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}

	}
}
