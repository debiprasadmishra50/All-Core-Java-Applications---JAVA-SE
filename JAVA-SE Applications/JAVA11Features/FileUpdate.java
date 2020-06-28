package JAVA11Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUpdate 
{
	public static void main(String[] args) throws IOException 
	{
		Path path = Files.writeString(Files.createTempFile("text", ".txt"), "Java 11 id cool");
		System.out.println(path);
		String str = Files.readString(path);
		System.out.println(str);
		
	}
}
/*
 * C:\Users\HP\AppData\Local\Temp\text528861596508664644.txt
Java 11 id cool
*/
