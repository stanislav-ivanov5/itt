package lesson02;

import java.util.Scanner;

/**
 * 	Да се състави програма, която по въведени координати на 2 позиции
	от шахматната дъска извежда отговор дали са оцветени в еднакъв или
	различен цвят.
	Шахматната дъска е квадратна.
	Въвеждат се две двойки числа от интервала [1..8].
	Пример: 2 2 3 2
	Изход: Позициите са с различен цвят
 *
 */

public class Zadacha14 {

	public static void main(String[] args) {
		
		// define and initialize variables for the two fields coordinates a(x,y)
		// and b(x,y)
		int ax = 0, ay = 0, bx = 0, by = 0;
		
		// open input stream
		Scanner sc = new Scanner(System.in);
		
		// input a(x)
		System.out.println("Enter ax: ");
		ax = sc.nextInt();
		while ((ax < 1) || (ax > 8)) {
			System.out.println("Invalid input, ax [1..8], enter new value: ");
			ax = sc.nextInt();
		}
		
		// input a(y)
		System.out.println("Enter ay: ");
		ay = sc.nextInt();
		while ((ay < 1) || (ay > 8)) {
			System.out.println("Invalid input, ay [1..8], enter new value: ");
			ay = sc.nextInt();
		}
		
		// input b(x)
		System.out.println("Enter bx: ");
		bx = sc.nextInt();
		while ((bx < 1) || (bx > 8)) {
			System.out.println("Invalid input, bx [1..8], enter new value: ");
			bx = sc.nextInt();
		}
		
		// input b(y)
		System.out.println("Enter by: ");
		by = sc.nextInt();
		while ((by < 1) || (by > 8)) {
			System.out.println("Invalid input, by [1..8], enter new value: ");
			by = sc.nextInt();
		}
		sc.close();
		
		// logic checking if the field positions are in the same color or not
		if ((ax % 2 == 0) && (ay % 2 == 0)) {
			if (((bx % 2 == 0) && (by % 2 == 0))
					|| ((bx % 2 == 1) && (by % 2 == 1))) {
				System.out.println("Позициите са с еднакъв цвят");
			} else {
				System.out.println("Позициите са с различен цвят");
			}
		} else if ((ax % 2 == 1) && (ay % 2 == 1)) {
			if ((bx % 2 == 1) && (bx % 2 == 1)) {
				System.out.println("Позициите са с еднакъв цвят");
			} else {
				System.out.println("Позициите са с различен цвят");
			}
		} else if ((ax % 2 == 0) || (ay % 2 == 0)) {
			if ((bx % 2 == 0) || (by % 2 == 0)) {
				System.out.println("Позициите са с еднакъв цвят");
			} else {
				System.out.println("Позициите са с различен цвят");
			}
		}
	}
}
