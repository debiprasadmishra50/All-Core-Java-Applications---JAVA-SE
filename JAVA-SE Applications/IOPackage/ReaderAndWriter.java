package IOPackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriter 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\myFile.txt");
		
		fw = new FileWriter("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\NEWFILE.txt");
		
		int ch;
		while ((ch=fr.read()) != -1) 
		{
			fw.write(ch);
		}
		System.out.println("File Copied");
		fr.close();
		fw.close();
	}
}
