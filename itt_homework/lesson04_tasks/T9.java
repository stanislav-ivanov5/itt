package lesson04_tasks;

import java.util.Scanner;

public class T9 {

	public static void main(String[] args) {

		int n = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n + i; j++) {
				if (j >= 1 && j <= n - i) {
					System.out.print(" ");
				} 
				else {
					if (i > 1 && i < n && (j <= n + i - 2) && (j >= n - i + 2)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
