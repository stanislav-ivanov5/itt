package lesson08;

import java.util.Arrays;

public class Zadacha9 {

	
	public static void main(String[] args) {
		
		// given string with digits, - sign, and letters
		String str = "asd-12sdf45-56asdf100";
		
		// new string builder
		StringBuilder sb = new StringBuilder(50);
		
		// convert the string to a char[] array
		char[] arr = str.toCharArray();
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++){
			// compare char[] elements with ascii code table, appen the digits 0..9 and - sign to the string builder
			if((((int) arr[i]) <= 57 && ((int) arr[i] >= 48)) || arr[i] == '-'){
				sb.append(arr[i]);
				if(i == arr.length - 1){	// if we reach last element of array continue
					continue;
				}
				if(((int) arr[i + 1]) <= 57 && ((int) arr[i + 1] >= 48)){ // check if the next element is a digit as well
					continue;
				}
				sb.append(" "); 	// append interval after each "number"
			}
		}
		// convert string builder to a string
		String bufferStr = sb.toString();
		
		// split the converted string by interval " "
		String[] stArr = bufferStr.split(" "); 
		
		// initialize variable to sum the numbers
		int result = 0;
		
		// print String[] stArr of "numbers"
		System.out.println(Arrays.deepToString(stArr));
		
		// parse array "elements" to Integer and sum them up
		for(int i = 0; i < stArr.length; i++){
			result += Integer.parseInt(stArr[i]);
		}
		
		// print sum
		System.out.println("Sum: " + result);
	}
}
