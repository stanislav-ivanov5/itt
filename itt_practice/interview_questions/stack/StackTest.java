package com.ampleample.task1;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	/**
	 * @throws IOException 
	 * 
	 */
	@Test
	public void testPush() {
		Stack stack = new Stack(10);
		stack.push('a');
		
		Assert.assertFalse(stack.isEmpty());
		stack.pop();
		Assert.assertTrue(stack.isEmpty());
	}
	
	@Test(expected=NegativeArraySizeException.class)
	public void testInvalidCtr() {
		new Stack(-1);
	}
	
	@Test
	public void testGetSize() {
		Stack stack = new Stack(10);
		int size = stack.getSize();
		Assert.assertEquals(0, size);
		
		stack.push('a');
		size = stack.getSize();
		Assert.assertEquals(1, size);
		
		stack.push('b');
		size = stack.getSize();
		Assert.assertEquals(2, size);
	}
	
}
