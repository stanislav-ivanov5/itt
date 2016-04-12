package lesson23_exceptions;

import java.util.Map;

public class ExceptionHandlerDemo {

	
	public static int[] divideArrays(int[] a1, int[] a2){
		
		int a3Length = (a1.length >= a2.length) ? 
					a2.length : a1.length ;
		
		int[] result = new int[a3Length];
		
		for(int index = 0; index < a3Length; index++){
			try{
				result[index] = a1[index] / a2[index];
			}
			catch(ArithmeticException e){
				System.out.println("Divide by zero");
				result[index] = 0;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String s = "adsjfalksd asdf asdf asd asdf ";
		
		String searchFor = "asdf";
		int count = 0;
		
		int sub = s.indexOf(searchFor);
		System.out.println(sub);
		
		while(sub != -1){
			sub = s.indexOf(searchFor, sub + 1);
			count++;
		}

		System.out.println(count);
		
		int[] a1 = {8, 3, 10, 24, 0, 4, 7, 14};
		int[] a2 = {4, 0, 5, 3, 9, 4};
		
		int[] a3 = divideArrays(a1, a2);
		
		for (int i = 0; i < a3.length; i++) {
			System.out.println(a3[i] + " ");
		}
	}
}
