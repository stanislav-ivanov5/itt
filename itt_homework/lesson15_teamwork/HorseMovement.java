package lesson15_teamwork;

import java.util.Scanner;

public class HorseMovement {
	static int count = 0;

	static void printArr(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	static char[][] fill(char[][] board, int row, int col) {

		if ((row < 0) || (row > board.length - 1)) {
			return board;
		}
		if ((col < 0) || (col > board[0].length - 1)) {
			return board;
		}
		if (board[row][col] == 'A') {
			return board;
		}
		board[row][col] = 'A';
		fill(board, row + 2, col + 1);
		fill(board, row + 2, col - 1);
		fill(board, row - 2, col + 1);
		fill(board, row - 2, col - 1);
		fill(board, row + 1, col + 2);
		fill(board, row + 1, col - 2);
		fill(board, row - 1, col + 2);
		fill(board, row - 1, col - 2);
		return board;
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
		board = fill(board, startRow, startCol);
		printArr(board);
	}
}
