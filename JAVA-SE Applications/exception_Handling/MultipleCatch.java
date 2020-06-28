package exception_Handling;

public class MultipleCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			String s = args[0]; //Can generate ArrayIndexOutOfBoundsException
			System.out.println("Input is : "+s);
			int a = Integer.parseInt(s); //Can generate NumberFormatException
			System.out.println("Output is : "+a);
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Please give an input");
		}
		catch (NumberFormatException e) 
		{
			System.out.println("please insert appropriate input");
		}
		System.out.println("More code can go here");
	}
}
