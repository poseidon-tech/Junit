package com.test.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UpperCaseTest {

private String actual;
private String expected;
private UpperCase upperCase=new UpperCase();

public UpperCaseTest(String expected ,String actual) {
	super();
	this.actual = actual;
	this.expected = expected;
}

@Parameters
public static Collection<String[]> testUpper()
{
	String outputs[][]= {{"UPPER","upper"},{"LOWER","lower"}};
	return Arrays.asList(outputs);
}

@Test
public void testUpperCase()
{
	
assertEquals(expected, upperCase.upper(actual));
}

}
