package lab10.utils;
import java.io.*;

public class Utils
{
	public static String readContentFromFile(String path)
	{
		StringBuilder read = new StringBuilder();
		File file = new File(path);
		try
		{
			if (!file.exists()) throw new FileNotFoundException("File không tồn tại");
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line;
			while  ((line = reader.readLine()) != null)
			{
				read.append(line + "\n");			
			}
			reader.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		return read.toString();
	}
	
	public static void writeContentToFile(String path, String content, boolean append)
	{
		File file = new File(path);
		try
		{
			if (!file.exists()) file.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(path, append));
			writer.write(content + "\n");
			writer.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
	}
	/* public static File findFileByName(String folderPath, String fileName) throws FileNotFoundException
	{
		File path = new File(folderPath);
		String[] contents = path.list();
		for (int i = 0; i < contents.length; i++)
		{
			if (contents[i].equals(fileName))
			{
				return new File(fileName);
			}
		}
		throw new FileNotFoundException("Không tồn tại file đó trong đường dẫn");
	} */
}
