package lesson05;
/**
 * Имате предварително въведени стойности на елементи в двумерен 
 * масив - естествени числа.
 * Да се състави програма, чрез която се извеждат стойностите на 
 * елементите в двумерен масив след обръщането му на +90 градуса
 *
 * Пример: 
 * 1,2,3
 * 4,5,6 
 * 7,8,9
 * 10,11,12
 * 
 * Изход
 * 10,7,4,1
 * 11,8,5,2
 * 12,9,6,3
 */
public class Zadacha4 {

	public static void main(String[] args) {
		
		// given array
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12},
		};
		
		int r = arr.length;	// rows
		int c = arr[0].length;	// cols
		
		// print first array
		for(r = 0; r < arr.length; r++){
			for(c = 0; c <  arr[0].length; c++){
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
		
		// initialize new array
		int[][] rotatedArr = new int[c][r];
		
		// assign rotated element to new array
		for(c = 0; c < rotatedArr.length; c++){
			for(r = rotatedArr[0].length - 1; r >= 0; r--){
				rotatedArr[c][r] = arr[arr.length - r - 1][c];
			}
		}
		
		// print rotated array
		for(c = 0; c < rotatedArr.length; c++){
			for(r = 0; r <  rotatedArr[0].length; r++){
				System.out.print(rotatedArr[c][r] + " ");
			}
			System.out.println();
		}
 	}
}
