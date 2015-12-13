package lesson05;

/**
 * Имате предварително въведени стойности от естествени числа, въведени в
 * квадратна таблица с размери 6 реда и 6 колони. Да се състави програма , чрез
 * която се намира сумата на всички елементи, чиято сума на индекси за ред и
 * колона е четно число. Програмата да извежда формираните суми за всеки отделен
 * ред на квадратната таблица, както и общата сума от тези елементи. Да се
 * използва само един цикъл
 *
 * Пример: 11,12,13,14,15,16, 21,22,23,24,25,26, 31,32,33,34,35,36,
 * 41,42,43,44,45,46, 51,52,53,54,55,56, 61,62,63,64,65,66
 * 
 * Изход: 11, ,13, ,15, , сума от елементите за реда: 39 22, ,24, ,26, сума от
 * елементите за реда: 72 31, ,33, ,35, , сума от елементите за реда: 99 42,
 * ,44, ,46, сума от елементите за реда: 132 51, ,53, ,55, , сума от елементите
 * за реда: 159 62, ,64, ,66 сума от елементите за реда: 192 Сума на елементите:
 * 693
 */
public class Zadacha7 {

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

		// print elements for each (rows+cols) = even and their sum per row
		for (r = 0; r < arr.length; r++) {
			for (c = 0; c < arr[0].length; c++) {
				boolean evenRC = (r + c) % 2 == 0; // true if for a given array
													// element (rows + cols) =
													// even number
				if (evenRC) {
					rSum += arr[r][c];
					System.out.print(arr[r][c]);
					// print comma at the right place
					if (c < arr[0].length - 1) {
						System.out.print(", ");
					}
				} else {
					if (c  > 0) {
						System.out.print(", ");
					}
				}
			}
			System.out.printf(" Sum: %d \n", rSum);
			result += rSum;
			rSum = 0;

		}

		// print sum of all found numbers
		System.out.println("Sum of elements: " + result);
	}
}
