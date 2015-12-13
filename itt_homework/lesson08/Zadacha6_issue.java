package lesson08;


import java.util.Scanner;

/**
 * Да се състави програма, чрез която се въвежда изречение с отделни думи. Като
 * резултат на екрана да се извежда същия текст, но всяка отделна дума да
 * започва с главна буква, а следващите я букви да са малки. Пример: супер яката
 * задача Изход: Супер Яката Задача
 *
 */
public class Zadacha6_issue {

	// validate input method
	static String validateInput(Scanner sc, String lineOne) {
		boolean isValid = true;

		for (int i = 0; i < lineOne.length(); i++) {
			if (lineOne.charAt(i) == '1' || lineOne.charAt(i) == '2' || lineOne.charAt(i) == '3'
					|| lineOne.charAt(i) == '4' || lineOne.charAt(i) == '5' || lineOne.charAt(i) == '6'
					|| lineOne.charAt(i) == '7' || lineOne.charAt(i) == '8' || lineOne.charAt(i) == '9'
					|| lineOne.charAt(i) == '0' || lineOne.charAt(i) == ',' || lineOne.charAt(i) == '.'
					|| lineOne.charAt(i) == '/' || lineOne.charAt(i) == '[' || lineOne.charAt(i) == '['
					|| lineOne.charAt(i) == ';' || lineOne.charAt(i) == ':' || lineOne.charAt(i) == '\''
					|| lineOne.charAt(i) == '"') {
				isValid = false;
			}
			while (!isValid) {
				System.out.println("Invalid input. Enter new line: ");
				lineOne = sc.nextLine();
				isValid = true;
			}
		}
		return lineOne;
	}

	// main method
	public static void main(String[] args) {

//		String sentence = "ivan dava pari";

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		validateInput(sc, sentence);
		
		String[] arr = sentence.split(" ");

		for (int i = 0; i < arr.length; i++) {
			String up = arr[i].toUpperCase();
			arr[i] = up.charAt(0) + arr[i].substring(1, arr[i].length());
		}

		StringBuilder sb = new StringBuilder(200);
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			sb.append(" ");
		}

		System.out.println(sb.toString());
	}
}
