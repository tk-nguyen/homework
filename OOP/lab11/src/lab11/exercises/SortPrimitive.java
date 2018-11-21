package lab11.exercises;

import java.util.ArrayList;

public class SortPrimitive<T extends Comparable<T>>
{	
	public void sortArray(T[] input)
	{
		for (int i = 1; i < input.length; i++)
		{
			int j = i;
			while (j > 0 && input[j-1].compareTo(input[j]) > 0)
			{
				T tmp = input[j];
				input[j] = input[j-1];
				input[j-1] = tmp;
				j--;
			}
		}
	}
}
