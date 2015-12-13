package lesson02;

import java.util.Scanner;

/**
 * 	Да се състави програма, която да отгатне колко е студено/топло по
	въведената температура t в градус Целзий.
	Температурните интервали са:
	под -20 ледено студено;
	между 0 и -20 - студено;
	между 15 и 0 - хладно;
	между 25 и 15 - топло;
	над 25 – горещо.
	Входни данни: цяло число от интервала [-100..100].
	Пример: 12
	Изход: хладно
 *
 */

public class Zadacha13 {

	public static void main(String[] args) {
		
		// define and initialize temperature variable
		int temperature = 0;
		
		// open an input stream and input a temperature
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature: [-100..100]");
		temperature = sc.nextInt();
		
		// validate the value of temperature
		while ((temperature < -100) || (temperature > 100)) {
			System.out.println("Invalid input. Enter new value");
			temperature = sc.nextInt();
		}
		
		// match temperature values with how cold is the weather
		if (temperature <= -20) {
			System.out.println("ice cold");
		} else if ((temperature >= -20) && (temperature <= 0)) {
			System.out.println("cold");
		} else if ((temperature >= 0) && (temperature <= 15)) {
			System.out.println("chilly");
		} else if ((temperature >= 15) && (temperature <= 25)) {
			System.out.println("warn");
		} else if (temperature >= 25) {
			System.out.println("hot");
		}
		
		// close the input stream
		sc.close();
	}
}
