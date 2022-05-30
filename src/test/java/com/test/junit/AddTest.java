package com.test.junit;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddTest {
	Add add=new Add();
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("This method is called once before execution  of all other methods");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("This method is called once after execution  of all other methods");
	}
	
	@Test
	public void testAdd()
	{
		//this passes test if method is empty
		//test method must be public and return type is always void
		//follow the convention used in this class for writing test cases
		//assertEquals first argument-expected ,second argument=actual
		//Invalid test class error is generated if not even one method is annotated with @test
	}
	

	@Test
	public void testAdd_intArg() {
		//fail("Not yet implemented");
		int res=add.add(1, 3);
		assertEquals(4, res);
        assertEquals(3, res);
		
	}
	@Test
	public void testAdd_floatArg() {
		//fail("Not yet implemented");
		Add add=new Add();
		float res=add.add(1f, 3f);
		assertEquals(4.0, res,0.0);
		assertEquals(3, res,0);
		
	}
	
	

}
