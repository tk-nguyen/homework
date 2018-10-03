package lab04.findSmallestArray;

import java.util.*;

public class FindSmallestElement 
{
	private static ArrayList<Integer> testArray = new ArrayList<Integer>();
	
	public static void fillArray()
	{
		Random seed = new Random();
		for (int i = 0; i < 100; i++)
		{
			testArray.add(seed.nextInt(101));
		}
	}
	
	public static int findSmallestElement()
	{
		testArray.sort(null);
		return testArray.get(0);
	}
	
}
