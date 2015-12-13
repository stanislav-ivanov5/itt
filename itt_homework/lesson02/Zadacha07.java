package lesson02;

import java.util.Scanner;

/**
 * 	Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
	пари (число с плаваща запетая), дали съм здрав – булев тип.
	Съставете програма, която взема решения на базата на тези данни по
	следния начин:
 	- ако съм болен, няма да излизам
 	- ако имам пари, ще си купя лекарства
 	- ако нямам – ще стоя вкъщи и ще пия чай
 	- ако съм здрав, ще отида на кино с приятели
 	- ако имам по-малко от 10 лв, ще отида на кафе.
	Полученото решение покажете като съобщение в конзолата.
 *
 */

public class Zadacha07 {

	public static void main(String[] args) {

		// define hour, moneyAmount and boolean amHealthy
		int hour = 0;
		float moneyAmount = 0F;
		boolean amHealthy = false;

		Scanner sc = new Scanner(System.in);
		
		// input hour number
		System.out.print("Enter hour [0..24]: ");
		hour = sc.nextInt();
		//validate hour
		while((hour > 24) || (hour < 0)){
			System.out.println("Invalid hour. Try again:");
			hour = sc.nextInt();	
		}
		
		// input money amount number
		System.out.print("Enter money amount: ");
		moneyAmount = sc.nextFloat();
		//validate money
		while(moneyAmount < 0){
			System.out.println("Invalid number. Try again:");
			moneyAmount = sc.nextFloat();	
		}

		// input amHealthy
		System.out.print("Enter are you healthy: ");
		amHealthy = sc.nextBoolean();

		// define conditions
		if (amHealthy == false) {
			System.out.println("Not going out");
			if (moneyAmount > 0) {
				System.out.println("Have money, will buy some medicine");
			} else {
				System.out.println("Don't have money, will stay at home"
						+ "drinking tea");
			}
		} else {
			if ((moneyAmount >= 10) && (hour >= 10)) {
				System.out.println("Going to cinema with friends");
			} 
			else {
				if(moneyAmount < 10 && hour >= 5){ 
					System.out.println("Goint to a cafe");
				}
			}
		if(hour < 5) {
			System.out.println("It's too early to go out");
		}
	}

		sc.close();
	}
}
