package string_reverse;

import java.util.Iterator;
import java.util.Stack;

public class LetterReverseOrder {

	public static void main(String[] args) {

		String[] array = { "hi", "there", "ivane" };

		printMethod(array);
		System.out.println();
		printReverseArray(array);

		String[] word = { "ivan" };
		System.out.println();
		printReverseWordFor(word);
		System.out.println("stack");
		stackMethod(array);
	}

	private static void stackMethod(String[] array) {
		Stack<String> stack = new Stack<>();
		
		for(String s : array) {
			stack.push(s);
		}
		
		Iterator<String> it = stack.iterator();
		System.out.println("\n initial stack: ");
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n reverse stack: ");
		while(!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		
		
	}

	private static void printReverseWordFor(String[] word) {
//		StringBuilder reverseWord = new StringBuilder(word.length);
		for (int i = word.length - 1; i >= 0; i--) {
			for(int j = word[i].length() - 1; j >=0; j--) {
//				reverseWord.append(word[i].charAt(j));
				System.out.print(word[i].charAt(j));
			}
//			System.out.println(reverseWord);
		}
	}

	private static void printReverseArray(String[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

	private static void printMethod(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
