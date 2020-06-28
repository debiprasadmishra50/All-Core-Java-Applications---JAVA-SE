package exception_Handling;

public class StringParser 
{
	public static void main(String[] args) 
	{
		String s = "ABCD";
		try
		{
			int a = Integer.parseInt(s); //NumberFormatException
		}catch (NumberFormatException e) 
		{
			System.out.println("Can not convert this string to an integer");
		}
	}
}
