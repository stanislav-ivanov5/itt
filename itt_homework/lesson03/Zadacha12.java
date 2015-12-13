package lesson03;

/**
 * Да се състави програма, която извежда всички естествени трицифрени числа,
 * които нямат еднакви цифри т.е. 100,101, 606 и т.н. не се извеждат.
 *
 */
public class Zadacha12 {

	public static void main(String[] args) {

		// define a, b, c for digits of the number
		int a, b, c;

		// cycle go through all numbers [100...999]
		for (int num = 100; num < 1000; num++) {
			a = (num / 100) % 10;	// find the digits of the number
			b = (num / 10) % 10;
			c = num % 10;
			
			// if there are equal digits skip the number
			if ((a == b) || (b == c) || (a == c)) {
				continue;
			}
			System.out.print(num);	// print num
			if (num < 987) {
				System.out.print(", ");
			}
		}
	}
}
