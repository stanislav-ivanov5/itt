package lesson03;

/**
 * Да се състави програма, която чрез цикъл while извежда таблицата за
 * умножение, но без повторение. Т.е. ако е изведено 4*5 не се извежда 5*4.
 * Пример: 1-ви ред: 1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9; 2-ри рeд: 2*2;
 * 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9; ... 9-ти ред: 9*9;
 *
 */
public class Zadacha23 {

	public static void main(String[] args) {
		
		// initialize two counters i - for the rows and j - for the columns
		int i = 1;
		int j = 1;
		
		// use while cycle to print all needed values
		while(i < 10){
			while(j < 10){
				System.out.printf("%d*%d; ", i, j);
				j++;
			}
			i++;
			j = i;
			System.out.print("\n");
		}

	}
}
