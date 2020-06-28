package exception_Handling;

public class Throw 
{
	public static void main(String[] args)
	{
		try
		{
			throw new Exception("Funds not avaolable");
		}catch (Exception e) 
		{
			System.out.println("Exception handled");
		}
	}
}
