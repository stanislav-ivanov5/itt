package lesson03;

import java.util.Scanner;

/**
 * 	Да се състави програма, която да изчисли сумата на 
	всички  числа от 1 до въведено число N.
	Пример: 5
	Изход: 15
	Използвайте цикъл do-while.
 *
 */
public class Zadacha15 {

	public static void main(String[] args) {
		// define and initialize num, result for summation, 
		int num = 0;
		int result = 0;
		int counter = 1;
		
		// open input stream na enter the number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		
		// check whether num is positive or negative
		if(num >= 0){
			do{
				result += counter;
				counter++;
			} 
			while (counter <= num);	
		} 
		else {
			counter = num;
			do{
				result += counter;
				counter++;
			}
			while (counter <= 1);
		}
		System.out.println(result);	// print the result 
	}
}
