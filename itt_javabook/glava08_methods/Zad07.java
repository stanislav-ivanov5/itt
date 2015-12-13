package glava08_methods;

import java.util.Scanner;

// returns array[x][y] with defaults 0-s
public class Zad07 {

	static int[][] arrFiller(int x, int y){
		int[][] arr = new int[x][y];
		
		return arr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[][] newArr = arrFiller(a, b);
		
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[0].length; j++) {
				newArr[i][j] = 0;
				System.out.print(newArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
