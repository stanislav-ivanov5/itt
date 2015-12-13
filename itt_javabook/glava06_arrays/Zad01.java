package glava06_arrays;

import java.util.Scanner;

// array 10 elements float type

public class Zad01 {

	public static void main(String[] args) {
		
		float[] arr = new float[10];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++){
			arr[i] = sc.nextFloat();
		}
		
		float result = 0;
		
		for(int i = 0; i < arr.length; i++){
			result += arr[i];
		}
		
		System.out.println(result);
	}
}
