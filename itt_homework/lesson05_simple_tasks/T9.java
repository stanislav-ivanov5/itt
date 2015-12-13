package lesson05_simple_tasks;
/**
 * Дадена е правоъ­гълна матрица с числа. Да се намери в нея 
 * максималната подмат­рица с размер 2 х 2 и да се отпечата на 
 * конзолата. Под максимална подматрица се разбира 
 * подматрица, която има максимална сума на елементите, които я съставят
 *
 */
public class T9 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][4];
		int maxSum = arr[0][0] + arr[0][1] + arr[1][0] + arr[1][1];
		int maxR;
		int maxC;
		
		for(int r = 0; r <= arr.length - 2; r++){
			for(int c = 0; c <= arr.length - 2; c++){
				int result = arr[r][c] + arr[r][c+1] + arr[r+1][c] + arr[r+1][c+1]; 
				if(result > maxSum){
					maxSum = result;
					maxR = r;
					maxC = c;
				}
			}
		}
	}
}
