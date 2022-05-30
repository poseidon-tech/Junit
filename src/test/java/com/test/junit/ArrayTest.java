package com.test.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testArray_Equality()
	{
		int actual[]= {5,4,3,2,1};
		int expected[]= {1,2,3,4,5};
		Arrays.sort(actual);
		assertArrayEquals(expected,actual);
	}
	
	@Test(expected = NullPointerException.class)
	public void testArray_Exception()
	{
	int[] arr= null;
	Arrays.sort(arr);
	}
	
	@Test(timeout = 1000)
	public void testArray_Performance()
	{
	int[] arr= {1,2,5,7,8,5,10,1000,4545,455,100};
	for(int i=1;i<1000000;i++)
	{
	arr[0]=i;
	Arrays.sort(arr);
	}
	}

}
