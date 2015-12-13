package glava16_variables;


// reverse a three digits number with array
public class Zad03 {

	public static void main(String[] args) {
		
		System.out.println(reverse(963));
	}
	
	static int reverse(int abc){
		
		int[] arr = new int[3];
		int reversed = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = abc % 10;
			abc /= 10;
		}
		
		reversed = arrayToInt(arr);
		
		return reversed; 
	}
	
	static int arrayToInt(int[] arr){
		int reversed = 0;
		int pow = 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			reversed += (arr[i] * pow) ;
			pow *= 10;
		}
		
		return reversed;
	}
}
