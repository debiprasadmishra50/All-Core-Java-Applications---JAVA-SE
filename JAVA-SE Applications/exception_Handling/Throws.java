package exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws 
{
	void fileRead() throws FileNotFoundException
	{
			FileInputStream fis = new FileInputStream("");
	}
	public static void main(String[] args) //throws FileNotFoundException //OR use try..catch
	{
		Throws t = new Throws();
		//t.fileRead();
		try
		{
			t.fileRead();
		}catch (FileNotFoundException e) 
		{
			System.out.println("File not found");
		}
		
		System.out.println("Terminates normally");
	}
}
