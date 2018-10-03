package lab04.findMax;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMaximum {

	@Test
	public void testMaximum1() 
	{	
		assertEquals("Correct!", 5, FindMaximum.findMaximum(5, 5));
	}
	
	@Test
	public void testMaximum2()
	{
		assertEquals("Failed test!", 5, FindMaximum.findMaximum(6, 5));
	}
	
	@Test
	public void testMaximum3()
	{
		assertEquals("Failed test!", 6, FindMaximum.findMaximum(99999, 5));
	}

	@Test
	public void testMaximum4()
	{
		assertEquals("Correct!", 66, FindMaximum.findMaximum(44, 66));
	}
	
	@Test
	public void testMaximum5()
	{
		assertEquals("Failed test!", "abc", FindMaximum.findMaximum(2, 3));
	}
}
