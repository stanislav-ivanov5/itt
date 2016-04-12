import java.util.Scanner;

public class CardsTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (; x <= 52; x++) {

			int number = (x - 1) / 4 + 2;
			if (number > 10) {
				char[] cardPresentations = { 'J', 'Q', 'K', 'A' };
				System.out.print(cardPresentations[number - 11]);
			} else {
				System.out.print(number);
			}

			switch (x % 4) {
			case 1:
				System.out.println(" of clubs.");
				break;
			case 2:
				System.out.println(" of diamonds.");
				break;
			case 3:
				System.out.println(" of hearts.");
				break;
			case 0:
				System.out.println(" of spades.");
				break;
			default:
				break;

			}
		}

	}
}
