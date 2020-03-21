package com.epam.JunitTestingTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JUnitTask {
	static RemovingAFromStart2Places removingAObj;
	@BeforeEach
	void initialize()
	{
		removingAObj=new RemovingAFromStart2Places();
	}
	/*
	 * emptyString: ""->"" 
	 * singleA: "A"->""    
	 * twoA's: "AA"->""  
	 * A only at 2nd position: "BA"->"B"  
	 * A only at position 1: "AB"->"B"
	 * normal string starting with 2 A's and a after first two positions: "AABCDA"->"BCDA" 
	 * 3 A's: "AAA"->"A"
	 * random string without any starting A's: "BCDAAA"->"BCDAAA"
	 */
	@Test
	void emptyString() {
		assertEquals("",removingAObj.removingA(""));
	}
	@Test
	void singleAAtIndex0()
	{
		assertEquals("",removingAObj.removingA("A"));
	}
	@Test
	void doubleAAtIndex0And1()
	{
		assertEquals("",removingAObj.removingA("AA"));
	}
	@Test
	void aAtIndex1()
	{
		assertEquals("B",removingAObj.removingA("BA"));
	}
	@Test
	void aAtIndex0()
	{
		assertEquals("B",removingAObj.removingA("AB"));
	}
	@Test
	void stringWithstarting2A()
	{
		assertEquals("BCDA",removingAObj.removingA("AABCDA"));
	}
	@Test
	void stringWith3A()
	{
		assertEquals("A",removingAObj.removingA("AAA"));
	}
	@Test
	void RandomString()
	{
		assertEquals("BCDAAA",removingAObj.removingA("BCDAAA"));
	}
	

}
