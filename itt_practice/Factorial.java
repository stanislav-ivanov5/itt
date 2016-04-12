import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		
		long fact = 1;
		
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(n <= 20){
			n = sc.nextInt();			
		}
		
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
		
		System.out.println(fact);
		
	}
}
