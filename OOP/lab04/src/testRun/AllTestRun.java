package testRun;


import org.junit.runner.*;
import org.junit.runner.notification.*;

import lab04.BMI.TestCalculateBMI;
import lab04.findMax.TestMaximum;
import lab04.findSmallestArray.TestFindSmallestElement;

public class AllTestRun
{
	public static void main (String[] args)
	{
		Result maximumTest = JUnitCore.runClasses(TestMaximum.class);
		Result findSmallestTest = JUnitCore.runClasses(TestFindSmallestElement.class);
		Result calculateBMITest = JUnitCore.runClasses(TestCalculateBMI.class);
		
		System.out.println("Maximum test: ");
		for (Failure maximumFail : maximumTest.getFailures())
		{
			System.out.println(maximumFail.getMessage());
		}
		
		System.out.println("FindSmallest test: ");
		for (Failure findSmallestFail : findSmallestTest.getFailures())
		{
			System.out.println(findSmallestFail.getMessage());
		}
		
		System.out.println("Calculate BMI test: ");
		for (Failure calculateBMIFail : calculateBMITest.getFailures())
		{
			System.out.println(calculateBMIFail.getMessage());
		}
		
	}
}
