package lab10.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UtilAnalyze
{
	public List<String> getAllFunctions(File path)
	{
		List<String> codeLines = new ArrayList<String>();
		if (path.canRead())
		{
			try
			{
				BufferedReader reader = new BufferedReader(new FileReader(path));
				String lines;
				while ((lines = reader.readLine()) != null) 
				{
					if (lines.indexOf("public static") != -1)
					{
						StringBuilder tmp = new StringBuilder();
						tmp.append(lines + "\n");
						int counter = 0;
						do
						{
							lines = reader.readLine();
							if (lines.trim().equals("{")) 
							{
								counter++;
								tmp.append(lines + "\n");
							}
							else if (lines.trim().equals("}")) 
							{
								counter--;
								tmp.append(lines + "\n");
							}
							else if (!(lines.trim().equals("")))
							{
								tmp.append(lines + "\n");
							}
						} while (counter != 0);
						codeLines.add(tmp.toString());
					}
				}
				reader.close();
			}
			catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
		return codeLines;
	}
	
	public String findFunctionByName(String name, File path)
	{
		String result = null;
		try
		{
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String lines;
			while ((lines = reader.readLine()) != null)
			{
				if ((lines.trim().indexOf(name.substring(0, name.indexOf("(") - 1))) != -1)
				{
					String found = lines.trim();
					
					//Danh sách các loại biến của hàm cần tìm và hàm tìm được
					ArrayList<String> variableTypesOfInput = new ArrayList<String>();
					ArrayList<String> variableTypesOfFound = new ArrayList<String>();
					
					//Lấy loại biến của hàm cần tìm 
					int startOfName = name.indexOf("(") + 1;
					int endOfName = name.indexOf(",");
					while (startOfName < endOfName)
					{
						variableTypesOfInput.add(name.substring(startOfName, endOfName).toLowerCase());
						startOfName = endOfName + 1;
						endOfName = name.indexOf(",", startOfName) != -1 ? name.indexOf(",", startOfName) : name.indexOf(")");
					}
					
					//Lấy loại biến của hàm tìm thấy
					int startOfFound = found.indexOf("(") + 1;
					int middleOfFound = found.indexOf(" ", startOfFound);
					int endOfFound = found.indexOf(",");
					while (startOfFound < endOfFound)
					{
						variableTypesOfFound.add(found.substring(startOfFound, middleOfFound).toLowerCase());
						startOfFound = endOfFound + 2;
						middleOfFound = found.indexOf(" ", startOfFound);
						endOfFound = found.indexOf(",", startOfFound) != -1 ? found.indexOf(",", startOfFound) : found.indexOf(")");
					}
					
					//Sort lại 2 array, so sánh xem chúng có bằng nhau không
					variableTypesOfInput.sort(null);
					variableTypesOfFound.sort(null);
					if (variableTypesOfInput.equals(variableTypesOfFound))
					{
						result = found;
						break;
					}
				}
			}
			reader.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		if (result == null) return "Không tìm thấy hàm bạn cần tìm!";
		else return "Tìm thấy hàm: " + result;
	}
}
