package lesson03;

import java.util.Scanner;

/**
 * 	Да се състави програма, чрез която се въвежда две числа от 
	интервала [1..9]. Програмата да извежда таблицата за умножение.
	Максималната стойност на множителите е определена от 2-те 
	числа. 
	
	Пример: 2 2 
	Изход:
	1*1= 1; 
	1*2= 2;
	2*1= 2; 
	2*2= 4;
 *
 */
public class Zadacha18 {

	public static void main(String[] args) {
		// define and initialize num1, num2 and product
		int num1 = 0, num2 = 0;
		int product = 0;
		
		// input stream
		Scanner sc = new Scanner(System.in);
		
		// enter num1 and validate the input
		System.out.println("Enter num1:");
		num1 = sc.nextInt();
		while( num1 < 1 || num1 > 9){
			System.out.println("Invalid input. Enter new value [1..9]");
			num1 = sc.nextInt();
		}
		// enter num2 and validate the input
		System.out.println("Enter num2:");
		num2 = sc.nextInt();
		while( num2 < 1 || num2 > 9){
			System.out.println("Invalid input. Enter new value [1..9]");
			num2 = sc.nextInt();
		}
		//close input stream
		sc.close();
		
//		if(num1 > num2){
//			int temp = num2;
//			num2 = num1;
//			num1 = temp;
//		}
		
		// calculate the product of entered numbers and print the result
		for(int i = 1; i <= num1; i++){
			for(int j = 1; j <= num2; j++){
				product = i * j;
				System.out.printf("%d * %d = %d; %n", i, j, product);
			}
		}
		
	}
}
