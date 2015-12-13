package season4_test_practice;

// infinite while loop

public class Zad06b {

	public static void main(String[] args) {
		
		int balance = 10;
		
		while(balance >= 1){
			if(balance < 9){
				System.out.println(5);
				continue;
			}
			balance = balance - 9;
		}
	}
}
