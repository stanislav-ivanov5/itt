package roman_numbers;

import java.util.Scanner;

public class RomanNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter roman number: ");
		String romanNum = sc.nextLine();

		int decNum = 0;

		boolean isPreceding = false;

		for (int i = 0; i <= romanNum.length() - 1; i++) {
			char c = romanNum.charAt(i);

			switch (c) {
			case 'M':
				decNum += 1000;
				break;
			case 'D':
				decNum += 500;
				break;
			case 'L':
				decNum += 50;
				break;
			case 'V':
				decNum += 5;
				break;
			case 'I':
				if (i < romanNum.length() - 1 && (romanNum.charAt(i + 1) == 'V'
						|| romanNum.charAt(i + 1) == 'X')) {
					isPreceding = true;
				}
				decNum = (isPreceding) ? (decNum - 1) : (decNum + 1);
				isPreceding = false;
				break;
			case 'X':
				if (romanNum.charAt(i + 1) == 'L'
						|| romanNum.charAt(i + 1) == 'C') {
					isPreceding = true;
				}
				decNum = (isPreceding) ? (decNum - 10) : (decNum + 10);
				isPreceding = false;
				break;
			case 'C':
				if (romanNum.charAt(i + 1) == 'D'
						|| romanNum.charAt(i + 1) == 'M') {
					isPreceding = true;
				}
				decNum = (isPreceding) ? (decNum - 100) : (decNum + 100);
				isPreceding = false;
				break;
			default:
				break;
			}
		}

		System.out.println("Roman: " + romanNum);
		System.out.println("Decimal number: " + decNum);
	}
}
