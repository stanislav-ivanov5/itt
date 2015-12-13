package lesson02;

import java.util.Scanner;

/**
 * Високосни години са всички години кратни на 4 с изключения столетията, но без
 * столетия кратни на 400, т.е. 1900 не е високосна, но 1600 и 2000 са
 * високосни. Съставете програма, която по дадени ден, месец, година отпечатва
 * следващата дата. Входни данни: три числа за ден, месец, година. Пример: 28,
 * 2, 2000 Изход: 1,3,2000
 *
 */

public class Zadacha12 {

	public static void main(String[] args) {
		// define and initialize variables for date, month and year
		short date = 0, month = 0, year = 0;

		// define and initialize new variables for date, month and year
		short newDate = 0, newMonth = 0, newYear = 0;

		Scanner sc = new Scanner(System.in);

		// initialize a variable for leap years
		boolean isLeapYear = false;

		// input date
		System.out.println("Enter date: ");
		date = sc.nextShort();
		while ((date < 1) || (date > 31)) {
			System.out.println("Invalid date");
			date = sc.nextShort();
		}

		// input month
		System.out.println("Enter month: ");
		month = sc.nextShort();
		while ((month < 1) || (month > 12)) {
			System.out.println("Invalid month");
			month = sc.nextShort();
		}

		// input year
		System.out.println("Enter year: [1500..]");
		year = sc.nextShort();
		while (year < 1500) {
			System.out.println("Invalid year");
			year = sc.nextShort();
		}
		// check if the year is leap
		if ((year % 4 == 0) && (year % 100 != 0)) {
			isLeapYear = true;
		} else if (year % 400 == 0) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}

		// check the input if the user input 29 February not leap year
		while ((!isLeapYear) && (date >= 29) && (month == 2)) {
			System.out
					.println("The year is not leap. \n"
							+ "February in leap year has 29 days.  \n There are the following options: \n"
							+ "1. Enter new date: \n"
							+ "2. Enter new month: \n"
							+ "3. Enter new year: \n"
							+ "Please select 1, 2 or 3 to continue ");
			short checker = sc.nextShort();
			switch (checker) {
			case 1:
				date = sc.nextShort();
				break;
			case 2:
				month = sc.nextShort();
				break;
			case 3:
				year = sc.nextShort();
				break;
			default:
				break;
			}
		}

		// print values of date, month, year
		System.out.printf("%d, %d, %d %n", date, month, year);

		switch (month) {
		case 2:
			if (date == 29) {
				newDate = 1;
				newMonth = (short) (month + 1);
				newYear = year;
			} else {
				newDate = (short) (date + 1);
				newMonth = month;
				newYear = year;
			}
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
			if (date == 31) {
				newDate = 1;
				newMonth = (short) (month + 1);
			} else {
				newDate = (short) (date + 1);
				newMonth = month;
			}
			newYear = year;
			break;
		case 12:
			if (date == 31) {
				newDate = 1;
				newMonth = 1;
				newYear = (short) (year + 1);
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if (date == 30) {
				newDate = 1;
				newMonth = (short) (month + 1);
			} else {
				newDate = (short) (date + 1);
				newMonth = month;
			}
			newYear = year;
			break;
		default:
			break;
		}

		// print the new values for date, month and year
		System.out.printf("%d, %d, %d %n", newDate, newMonth, newYear);

		// close input stream
		sc.close();
	}
}
