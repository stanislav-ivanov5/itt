package lesson03;

/**
 * 	Да се изведат на екрана всички нечетни числа от -10 
	до 10
 *
 */

public class Zadacha03 {
	public static void main(String[] args) {
		// use for loop and if statement for the odd numbers
		for(int i = -10; i <= 10; i++){
			if(!(i % 2 == 0)){
				System.out.println(i);	
			}
		}
	}
}
