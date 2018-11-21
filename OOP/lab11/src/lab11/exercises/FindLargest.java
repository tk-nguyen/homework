package lab11.exercises;

public class FindLargest<T extends Comparable<T>>
{
	public T findLargest(T[] input)
	{
		SortPrimitive<T> array = new SortPrimitive<T>();
		array.sortArray(input);
		return input[input.length-1];
	}
}
	