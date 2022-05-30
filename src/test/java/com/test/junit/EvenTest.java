package com.test.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EvenTest {
	Even even;
	Boolean res;
	
	@Before
	public void before()
	{
		even=new Even();
		System.out.println("This runs before every test method-to initialize resources");
	}
	@After
	public void tearDown()
	{
		even=null;
		System.out.println("This runs after every test method-to clean up resources");

	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testisEven_PositiveScenario()
	{
		res=even.isEven(112);
		assertTrue(res);
		assertTrue("The condition failed expected true", false); // String displays a message in case of failure
	}
	
	@Test
	public void testisEven_NegativeScenario()
	{
		res=even.isEven(111);
		assertFalse("The condition failed expected false",res);
	}

}
