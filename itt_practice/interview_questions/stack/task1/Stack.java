package com.ampleample.task1;

/**
 * This is very cool stack.
 * @author Stanislav Ivanov
 *
 */
public class Stack {
	
	private int maxSize;
	private char[] stackArray;
	private int top;

	/**
	 * 
	 * @param max 
	 */
	public Stack(int max) {
		maxSize = max;
		stackArray = new char[maxSize];
		top = -1;
	}

	/**
	 * This method does...
	 * @param j
	 */
	public void push(char j) {
		stackArray[++top] = j;
	}

	/**
	 * 
	 * @return
	 */
	public char pop() {
		return stackArray[top--];
	}

	/**
	 * 
	 * @return
	 */
	public char peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public int getSize() {
		return top+1;
	}
}
