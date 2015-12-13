package lesson05;
/**
 * Имате двумерен масив 6х5 от естествени числа, 
 * чийто стойности са въведени предварително. Да се състави програма, 
 * чрез която се извеждат елементите от масива с 
 * най-малката и най-голямата стойност.
 *
 */

public class Zadacha1 {

	public static void main(String[] args) {
		
		// initialize 2d array
		int[][] arr = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65},
		};
		
		// assign min and max
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		// find min and max goint through array elements
		for(int row = 0; row < arr.length; row++){
			for(int col = 0; col < arr[0].length; col++){
				if(arr[row][col] < min){
					min = arr[row][col];
				}
				if(arr[row][col] > max){
					max = arr[row][col];
				}
			}
		}
		
		// print result
		System.out.printf("Min: %d \n"
				+ "Max: %d", min, max);
	}
}
