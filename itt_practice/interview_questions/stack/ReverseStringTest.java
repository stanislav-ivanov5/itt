package com.ampleample.task1;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class ReverseStringTest {

	@Test
	public void testReverse() {
		ReverseString r = new ReverseString();
		String result = r.reverse("abcd");
		
		Assert.assertEquals("dcba", result);
	}
	
	@Test
	public void testReverseWithNull() {
		ReverseString r = new ReverseString();
		String result = r.reverse(null);
		
		Assert.assertNull(result);
	}

}
