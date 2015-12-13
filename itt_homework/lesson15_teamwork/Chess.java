package lesson15_teamwork;

import java.util.Scanner;

public class Chess {
	static int count = 0;
	static char player(int count){
		char check = ' ';
		if (count % 2 == 0) {
			check = '1';
			
		}
		else {
			check = '2';
		}
		return check;
	}
	static void print(char[][] board){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	static boolean validate(char[][] board,int row, int col){
		boolean isTaken = true;
		if (board[row][col] != ' ' ){
			play(board);
			isTaken = false;
		}
		return isTaken;
	}
	static boolean isWin(char[][] board){
		boolean win = false;
		for (int i = 0; i < board.length; i++) {
			if ((board[i][0]==board[i][1])&&(board[i][1]==board[i][2])) {
				win = true;
			}
			if ((board[0][i]==board[1][i])&&(board[1][i]==board[2][i])) {
				win = true;
			}
		}
		if ((board[0][0]==board[1][1])&&(board[1][1]==board[2][2])) {
			win = true;
		}
		if ((board[2][0]==board[1][1])&&(board[1][1]==board[0][2])) {
			win = true;
		}
		return win;
	}
	static void play(char[][] board){
		Scanner sc = new Scanner(System.in);
			System.out.print(player(count)+":");
			int row = sc.nextInt();
			int col = sc.nextInt();
			if (validate(board,row,col)) {
				if (player(count)== '1') {
					board[row][col] = 'X';
					print(board);
				}
				else{
					board[row][col] = 'Y';
					print(board);
				}
			}
		if (isWin(board)) {
				System.out.println("Player " +player(count) + " wins!");
				return;
		}
		count++;
		play(board);
	}
	
	public static void main(String[] args) {
		char[][] board = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = ' ';
			}
		}
		play(board);
		
	}

}
