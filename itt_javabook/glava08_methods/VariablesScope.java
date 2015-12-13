package glava08_methods;

public class VariablesScope {

	static void printNum(int num){
		num = 5;
		System.out.println("Number in method " + num);
	}
	
	public static void main(String[] args) {
		
		int n = 3;
		System.out.println("Before method " + n);
		printNum(n);
		System.out.println("After method " + n);
	}
}
