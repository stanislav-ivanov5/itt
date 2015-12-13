package lesson04;

/**
 * Имате предварително въведен едномерен масив, съдържащ реални числа. Да се
 * състави програма, чрез която се избират само елементи със стойности от
 * интервала [-2.99..2.99] и новата редица се извежда на екрана. Пример:
 * 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2 Изход: 0.2; 0.99; 1.4; 1.2
 *
 */

public class Zadacha14 {

	public static void main(String[] args) {

		// initialize array
		double[] arr = new double[] { 7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5,
				-110, 212, 341, 1.2 };

		// loop through array check if the number is in range [-2.99..2.99]
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > -2.99 && arr[i] < 2.99) {
				System.out.print(arr[i]);
				if (i < arr.length) {
					System.out.print("; ");
				}
			}
		}

	}
}
