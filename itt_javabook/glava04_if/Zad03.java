package glava04_if;

import java.util.Scanner;

// am I healthy and if

public class Zad03 {
	public static void main(String[] args) {

		boolean amHealthy = false;
		float moneyAmount = 0.0F;

		Scanner sc = new Scanner(System.in);

		amHealthy = sc.nextBoolean();
		moneyAmount = sc.nextFloat();

		if (!amHealthy) {
			System.out.println("don't go out");
			if (moneyAmount > 10) {
				System.out.println("buy medicine");
			} else {
				System.out.println("dring tea");
			}
		}
		else {
			if (moneyAmount > 10) {
				System.out.println("go to cinema");
			} else {
				System.out.println("go to a cafe");
			}
		}

	}
}
