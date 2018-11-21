package lab11.test;

import java.util.ArrayList;
import java.util.Random;

import lab11.exercises.FindLargest;
import lab11.exercises.SortPrimitive;

public class TestDrive
{

	public static void main(String[] args)
	{
		final int quantity = 100;
		
		
		Double[] doubles = new Double[quantity];
		Random seed = new Random();	
		for (int i = 0; i < quantity; i++)
			doubles[i] = seed.nextDouble();
		
		
		for (int i = 0; i < quantity; i++)
			System.out.print(doubles[i] + " ");
		System.out.println();
		
		SortPrimitive<Double> testSort = new SortPrimitive<Double>();
		
		testSort.sortArray(doubles);	
		for (int i = 0; i < quantity; i++)
			System.out.print(doubles[i] + " ");
		System.out.println();
		
		
		FindLargest<Double> testFind = new FindLargest<Double>();
		System.out.println("Largest element: " + testFind.findLargest(doubles));
	}

}
