package lesson05_simple_tasks;

/**
 * Напишете програма, която за матрица от булеви стойности, проверява дали се
 * съдържа елемент със стойност true над втория диагонал
 *
 */

public class T8 {

	public static void main(String[] args) {

		int row = 0;
		int col = 0;

		boolean[][] mat = new boolean[][] { { true, false, true },
				{ false, true, true }, { false, true, false },
				{ true, true, true }, };

		// 2nd diagonal - [1,0] [2,1] [3,2]
		boolean contains = false;
		int j = 0;
		for (int i = 0; i < mat.length; i++) {
			// if i > 0, j = i - 1; if i= 0; j = 0, to avoid indexOutOfBoundsEx
			j = (i > 0) ? (i - 1) : 0;

			for (j = j; j < mat[0].length; j++) {
				if (mat[i][j] == false) {
					contains = true;
					break;
				}
			}
		}

		if (contains) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
