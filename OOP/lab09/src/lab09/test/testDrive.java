package lab09.test;
import java.io.FileNotFoundException;

import lab09.utils.*;

public class testDrive
{

	public static void main(String[] args)
	{
		String directory = "../lab09/testFolder/";
		try
		{
			System.out.println(Utils.findFileByName(directory, "tet.txt"));
		}
		catch (FileNotFoundException ex)
		{
			ex.printStackTrace();
		}
		Utils.writeContentToFile(directory + "tst.txt", "test content", false);
		Utils.writeContentToFile(directory + "test.txt", "test content", true);
		Utils.writeContentToFile(directory + "test.txt", "test content 2", true);
		System.out.println(Utils.readContentFromFile(directory + "test.txt"));
	}
}
