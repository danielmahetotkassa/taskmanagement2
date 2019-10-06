package com.odyssey.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestJava8Methods {

	Java8Example java8 = new Java8Example();
	String str = java8.getString("Daniel");
	
	// Create names collections and return the filtering criteria
	
	List<String> names = new ArrayList<>();

	
	@Test
	public void testMethods() {
		
		assertEquals("leinaD", str);
		
	}
	
	@Test
	public void testGetFilterResult() {
		
		names.add("Daniel");
		names.add("Amislae");
		names.add("Dere");
		names.add("Haile");
		
		List<String> name = java8.getFilterResult(names);
		List<String> enames = new ArrayList<>();
		enames.add("Daniel");

		assertEquals(enames, name);
		
	}
	
	@Test
	public void testCase() {
		
		boolean flag = true;
		
	//	assertFalse(flag);
		assertTrue(flag);
		
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void testCase2() {
		
		System.out.println("This is an Exception");
		
		java8.getException(0);
		
	}

}
