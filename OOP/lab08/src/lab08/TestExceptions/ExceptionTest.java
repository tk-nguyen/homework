package lab08.TestExceptions;

import java.io.*;

public class ExceptionTest
{
	public static void main(String[] args) throws IOException
	{
		// TestNullPointer();
		// TestArrayIndex();
		// TestClassCast();
		// TestIO();
		// TestFileNotFound();
	}

	public static void TestNullPointer() throws NullPointerException
	{
		try
		{
			Integer a = null;
			int test = a.intValue() + 1;
		} 
		catch (NullPointerException ex)
		{
			ex.printStackTrace();
		}
	}

	public static void TestArrayIndex() throws ArrayIndexOutOfBoundsException
	{
		try
		{
			int[] test = new int[5];
			int access = test[5];
		} 
		catch (ArrayIndexOutOfBoundsException ex)
		{
			ex.printStackTrace();
		}
	}

	public static void TestArithmetic() throws ArithmeticException
	{
		try
		{
			int a = 2 / 0;
		} 
		catch (ArithmeticException ex)
		{
			ex.printStackTrace();
		}
	}

	public static void TestClassCast() throws ClassCastException
	{
		try
		{
			Object a = new Integer(5);
			String b = (String) a;
		} 
		catch (ClassCastException ex)
		{
			ex.printStackTrace();
		}
	}

	public static void TestIO() throws IOException
	{
		try
		{
			BufferedReader read = new BufferedReader(new FileReader("src/lab08/TestExceptions/test.txt"));
			read.close();
			read.readLine();
		} 
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}

	public static void TestFileNotFound() throws FileNotFoundException
	{
		try
		{
			BufferedReader read = new BufferedReader(new FileReader("nein"));
		} 
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
	}

}
