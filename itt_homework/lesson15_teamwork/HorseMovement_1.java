package lesson15_teamwork;

import java.util.Scanner;

public class HorseMovement_1 {
	static int cout = 0;

	static void printArr(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	static int counter() {
		cout++;
		return cout;
	}

	static void fill(char[][] board, int row, int col) {
		int rows = board.length;
		int cols = board[0].length;
		if ((row < 0) || (row > board.length - 1)) {
			return;
		}
		if ((col < 0) || (col > board[0].length - 1)) {
			return;
		}
		if (board[row][col] == 'A') {
			return;
		}
		int maxCount = board.length * board[0].length;
		board[row][col] = 'A';
		counter();
		if ((rows == 3) && (cols == 3)) {
			if ((row == 1) && (col == 1)) {
				board[row][col] = 'A';
				printArr(board);
			} else {
				if (cout == maxCount - 1) {
					printArr(board);
				}
			}
		}
		// basic case
		if ((rows >= 3) && (cols >= 3)) {
			if (cout == maxCount) {
				printArr(board);
			}
		}
		if ((rows == 1) || (cols == 1) || ((rows == 2) && (cols == 2))) {
			board[row][col] = 'A';
			printArr(board);
		}
		if (rows < 3 || cols < 3) {
			printArr(board);
			System.out.println("*****************************");
		}
		fill(board, row + 2, col + 1);
		fill(board, row + 2, col - 1);
		fill(board, row - 2, col + 1);
		fill(board, row - 2, col - 1);
		fill(board, row + 1, col + 2);
		fill(board, row + 1, col - 2);
		fill(board, row - 1, col + 2);
		fill(board, row - 1, col - 2);
	}

	static void validate(int n) {

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter board dimentions");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		char[][] board = new char[rows][cols];
		System.out.println("Enter starting point:");
		int startRow = sc.nextInt();
		int startCol = sc.nextInt();
		fill(board, startRow, startCol);
	}
}
