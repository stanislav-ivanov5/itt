package lesson05;

/**
 * Да се състави програма, при която предварително са въведени естествени числа
 * в двумерен масив 4*4 елемента. Програмата да извежда резултат от проверката
 * какво е съотношението на най-голямата сума по редове спрямо най-голямата сума
 * по колони
 * 
 * Пример: 1,2,3,4 5,6,7,8 9,10,11,12 13,14,15,16
 * 
 * Изход: най-голяма сума по редове 58 най-голяма сума по колони 40 Максималната
 * сума по редове е > от максималната сума по колони
 *
 */
public class Zadacha5 {

	public static void main(String[] args) {

		// initialize array
		int[][] arr = new int[4][4];

		int num = 1; // filling number

		// fill array with numbers [1..16]
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				arr[r][c] = num++;
			}
		}

		int rSum = 0; // current rows sum 
		int cSum = 0;// current cols sum
		int rMax = Integer.MIN_VALUE, cMax = Integer.MIN_VALUE;

		// calculate rSum, check is it bigger than rMax
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				rSum += arr[r][c];
			}
			if (rSum > rMax) {
				rMax = rSum;
			}
			rSum = 0;
		}

		// calculate cSum, check is it bigger than cMax
		for (int c = 0; c < arr[0].length; c++) {
			for (int r = 0; r < arr.length; r++) {
				cSum += arr[r][c];
			}
			if (cSum > cMax) {
				cMax = cSum;
			}
			cSum = 0;
		}

		// print rows max and cols max
		System.out.printf("Rows max: %d", rMax);
		System.out.println();
		System.out.printf("Cols max: %d", cMax);
		System.out.println();
		// check which is bigger
		boolean isRMaxBigger = (rMax > cMax) ? true : false;

		// print the result
		if (isRMaxBigger) {
			System.out.println("Rows max is bigger than columns max");
		} else {
			System.out.println("Rows max is bigger than columns max");
		}
	}
}
