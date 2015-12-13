package lesson05;

/**
 * Имате предварително въведени стойности от естествени числа. Числата са
 * въведени в квадратна таблица с размери 6 реда и 6 колони. Да се състави
 * програма, чрез която се намира сумата на всички елементи от редовете с четни
 * номера: 2,4 и 6. Програмата да извежда и сумата на всеки отделен ред 
 * Пример:
 * 11,12,13,14,15,16, 
 * 21,22,23,24,25,26, 
 * 31,32,33,34,35,36, 
 * 41,42,43,44,45,46,
 * 51,52,53,54,55,56, 
 * 61,62,63,64,65,66
 * 
 * Изход: 
 * 21,22,23,24,25,26 сума 141 
 * 41,42,43,44,45,46 сума 261
 * 61,62,63,64,65,66 сума 381 
 * Сума на елементите 783
 */
public class Zadacha6 {

	public static void main(String[] args) {

		int r = 6; // rows
		int c = 6; // cols
		int rSum = 0; // current row sum
		int result = 0; // sum of all even rows
		int[][] arr = new int[r][c]; // initialize array

		int num = 11; // number filler

		// fill array with numbers
		for (r = 0; r < arr.length; r++) {
			for (c = 0; c < arr[0].length; c++) {
				arr[r][c] = num++;
			}
			num += 4;
		}

		// print array
		for (r = 0; r < arr.length; r++) {
			for (c = 0; c < arr[0].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}

		System.out.println();

		// print elements at even rows and their sum
		for (r = 0; r < arr.length; r++) {
			boolean evenRow = (r + 1) % 2 == 0;
			for (c = 0; c < arr[0].length; c++) {
				if (evenRow) {
					rSum += arr[r][c];
					System.out.print(arr[r][c] + " ");
				}
			}
			if (evenRow) {
				System.out.println("Sum: " + rSum);
				rSum = 0;
			}
		}

		// calculate sum of all elements at even row
		for (r = 0; r < arr.length; r++) {
			for (c = 0; c < arr[0].length; c++) {
				if ((r + 1) % 2 == 0) {
					result += arr[r][c];
				}
			}
		}

		// print result
		System.out.println("Sum of elements: " + result);
	}
}
