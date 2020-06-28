package stringTokenizer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BuffReader_FileRead_CountWords 
{
	public static void main(String[] args) 
	{
		FileReader fr = null;
		BufferedReader br = null;
		int count = 0;
		int cnt = 0;
		
		try {
			fr = new FileReader("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\myFile.txt");
			br = new BufferedReader(fr);
			
			String line;
			System.out.println("Doint it by split() and StringTokenizer Class");
			while((line=br.readLine()) != null)
			{
				String[] s = line.split(" ");
				for (String res : s) 
				{
					System.out.println(res);
					cnt++;
				}
				
		//-------------------------------------------------------------------------------
				StringTokenizer st = new StringTokenizer(line," ");
				while(st.hasMoreTokens())
				{
					System.out.println(st.nextToken());
					count++;
				}
			}
			System.out.println("No of words in the file are : "+cnt);
			System.out.println("No of words in the file are : "+count);
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		
				
				
				
				
				
	}
}
