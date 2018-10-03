package lab04.BMI;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculateBMI
{

	@Test
	public void testBMI1()
	{
		assertEquals("Success", "Béo phì", CalculateBMI.calculateBMI(78, 1.7));
	}
	
	@Test
	public void testBMI2()
	{
		assertEquals("Failed test!", "Thiếu cân", CalculateBMI.calculateBMI(60, 1.76));
	}
	
	@Test
	public void testBMI3()
	{
		assertEquals("Failed test!", "Béo phì", CalculateBMI.calculateBMI(48.5, 1.84));
	}
	
	@Test
	public void testBMI4()
	{
		assertEquals("Failed test!", "Thừa cân", CalculateBMI.calculateBMI(82.6, 1.53));
	}
	
	@Test
	public void testBMI5()
	{
		assertEquals("Success", "Bình thường", CalculateBMI.calculateBMI(54, 1.7));
	}

}
