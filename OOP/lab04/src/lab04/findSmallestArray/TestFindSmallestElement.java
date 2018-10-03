package lab04.findSmallestArray;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFindSmallestElement 
{	
	
	@Test
	public void testFindSmallestElement1() 
	{
		FindSmallestElement.fillArray();
		assertEquals("Failed test!", 5, FindSmallestElement.findSmallestElement());
	}
	
	
	@Test
	public void testFindSmallestElement2() 
	{
		FindSmallestElement.fillArray();
		assertEquals("Failed test!", 5, FindSmallestElement.findSmallestElement());
	}
	
	@Test
	public void testFindSmallestElement3() 
	{
		FindSmallestElement.fillArray();
		assertEquals("Failed test!", 5, FindSmallestElement.findSmallestElement());
	}
	
	@Test
	public void testFindSmallestElement4() 
	{
		FindSmallestElement.fillArray();
		assertEquals("Failed test!", 5, FindSmallestElement.findSmallestElement());
	}
	
	@Test
	public void testFindSmallestElement5() 
	{
		FindSmallestElement.fillArray();
		assertEquals("Success!", 0, FindSmallestElement.findSmallestElement());
	}

}
