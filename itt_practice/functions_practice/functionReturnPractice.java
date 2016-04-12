package functions_practice;

// return for validating input

public class functionReturnPractice {

	static void returnFunction(int n){
		if( n < 0){
			System.out.println("Invalid n");
			return;
		}
		System.out.println("OK");
	}
	
	public static void main(String[] args) {
		
		returnFunction(7);
	}
}
