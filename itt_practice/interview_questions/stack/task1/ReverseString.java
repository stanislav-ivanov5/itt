package com.ampleample.task1;

import java.io.*;

/**
 * 
 * @author Stanislav Ivanov
 */
public class ReverseString {

	/**
	 * This class uses {@link Stack} for reversing a string.
	 * 
	 * @param input
	 * @return
	 * 		Reversed string, if input is not null. 
	 * 		Otherwise return null.
	 * 
	 * 
	 * @see Stack
	 */
	public String reverse(String input){
		
		if (input == null) {
//			throw new IllegalArgumentException("input parameter must not be null");
			return null;
		}
		
		int stackSize = input.length();
		Stack inputStack = new Stack(stackSize);
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			inputStack.push(ch);
		}

		StringBuilder output = new StringBuilder(20);
		output.setLength(0);
		while (!inputStack.isEmpty()) {
			char ch = inputStack.pop();
			output = output.append(ch);
		}
		return output.toString();
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Type a string: ");
		String input = bufferRead.readLine();
		String output;

		ReverseString reversedStack = new ReverseString();
		output = reversedStack.reverse(input);
		System.out.println("Reversed: " + output);
	}

}
