package lab10.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import lab10.utils.UtilAnalyze;

public class testDrive
{
	public static void main(String[] args) throws IOException
	{
		File path = new File("src/lb10/utils/Utils.java");
		UtilAnalyze test = new UtilAnalyze();

		List<String> result = test.getAllFunctions(path);
		for (int i = 0; i < result.size(); i++)
			System.out.println(result.get(i));
		System.out.println(test.findFunctionByName("writeContentToFile(sTring,String,Boolean)", path));
	}
}
