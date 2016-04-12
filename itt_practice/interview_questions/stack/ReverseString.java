package com.ampleample.com;

import java.util.Scanner;


public class ReverseString {

	private static int counter;
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type hello: " );
		String writeHello = input.nextLine();
		
		String hello = writeHello;
		int size = hello.length();
		
		for (int i=0; i< hello.length();i++) {
			
			if (hello.charAt(i) == hello.charAt(hello.length()-i)) {
				
			}
			hello = hello.substring((i+1),hello.length()-i);
		}
		System.out.println(hello);
		
		
	}
}
