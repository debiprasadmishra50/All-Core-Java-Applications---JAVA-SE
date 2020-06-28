package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo 
{
	public static void main(String[] args) 
	{
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try 
		{
			fos = new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Debiprasad Mishra\\Hexaware Learning\\Hexaware\\Emp.ser");  //.ser extension is for serialized files //Emp.ser will be created
			oos = new ObjectOutputStream(fos);
		
			Employee emp = new Employee(1, "john", 10000, 12345);
			oos.writeObject(emp);
			System.out.println("Employee object Serialized");
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} 

	
	
	}
	
}
