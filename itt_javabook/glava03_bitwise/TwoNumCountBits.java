package glava03_bitwise;

import java.util.Scanner;

// count the equal bits in two number which are entered by user
public class TwoNumCountBits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Integer a = sc.nextInt();
		Integer b = sc.nextInt();

		sc.close();

		int temp = a;
		int ones = 0;
		int zeros = 0;

		while (temp > 0) {
			if (temp % 2 == 0) {
				zeros++;
			} else {
				ones++;
			}
			temp /= 2;
		}

		temp = b;
		while (temp > 0) {
			if (temp % 2 == 0) {
				zeros++;
			} else {
				ones++;
			}
			temp /= 2;
		}

		System.out.println("1: " + ones + " 0: " + zeros);
	}
}
