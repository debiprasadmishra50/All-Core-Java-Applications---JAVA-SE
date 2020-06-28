package IOPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput_Copy 
{
	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try 
		{
			fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\img.png");
			fos = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\NEWimg.png");
			
			int data;
			while ((data=fis.read()) != -1) 
			{
				fos.write(data);
			}
			System.out.println("File Copied");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		}
		
		
	}
}
