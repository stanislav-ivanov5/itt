package lesson03;

import java.util.Scanner;

/**
 * 	Дадено е наредено тесте карти. 
	Наредбата по тежест на карта е: 2,3,4,5,6,7,8,9,10, Вале, Дама, 
	Поп, Асо.
	Наредбата по цвят на картите е: спатия, каро, купа, пика.
	Да се създаде програма, чрез която се въвежда N - число от 
	интервала [1..51] и се извеждат въведения номер карта и 
	останалите по-големи карти от тестето. 
	Пример: 47. 
	Изход: Поп купа, Поп пика, Асо спатия, Асо каро, Асо купа, Асо 
	пика
 *
 */

public class Zadacha21 {

	public static void main(String[] args) {
		// define and initialize number for user input
		int number = 0;
		int cardNumber = 0;
		int cardSuit = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter card number: ");
		number = sc.nextInt();
		while ((number < 1) || (number > 51)) {
			System.out.println("Invalid input. Enter new value:");
			number = sc.nextInt();
		}
		sc.close();


		while(number <= 51){

			// increase number + 3, so the division become greater than 0
			cardNumber = (number + 3) / 4;
			cardSuit = number % 4;
			
			// 13 different cards, so thirteen switch cases
			switch (cardNumber) {
			case 0:
			case 1:
				System.out.print("Two ");
				break;
			case 2:
				System.out.print("Three ");
				break;
			case 3:
				System.out.print("Four ");
				break;
			case 4:
				System.out.print("Five ");
				break;
			case 5:
				System.out.print("Six ");
				break;
			case 6:
				System.out.print("Seven ");
				break;
			case 7:
				System.out.print("Eight ");
				break;
			case 8:
				System.out.print("Nine ");
				break;
			case 9:
				System.out.print("Ten ");
				break;
			case 10:
				System.out.print("Jack ");
				break;
			case 11:
				System.out.print("Queen ");
				break;
			case 12:
				System.out.print("King ");
				break;
			case 13:
				System.out.print("Ace ");
				break;
			default:
				System.out.print("No such card ");
				break;
			}
			
			// four card suits
			switch (cardSuit) {
			case 1:
				System.out.print("Clubs ");
				break;
			case 2:
				System.out.print("Diamonds ");
				break;
			case 3:
				System.out.print("Hearts ");
				break;
			case 0:
			case 4:
				System.out.print("Spades ");
				break;
			default:
				System.out.println("No such suit ");
				break;
			}
			
			// increment number to print the next values
			number++;
		}

	}

}
