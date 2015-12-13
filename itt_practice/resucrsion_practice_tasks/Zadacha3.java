package resucrsion_practice_tasks;
/*
 * check if a number is prime
 */
public class Zadacha3 {

	static int primeNum(int n){
		if(n == 1){
			return 1;
		}
		if(n <= 3){
			return 1;
		}
		return (n % primeNum(n - 1) == 0) ? 2 : 1;
	}
	
	static void printResult(int n){
		if(primeNum(n) == 2){
			System.out.println("Not prime");
		}
		else {
			if(primeNum(n) == 1){
				System.out.println("prime");
			}
		}
			
	}
	
	public static void main(String[] args) {
		
		printResult(22);
	}
}
