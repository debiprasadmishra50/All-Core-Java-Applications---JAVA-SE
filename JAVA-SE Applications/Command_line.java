
public class Command_line 
{
	public static void main(String[] args) 
	{
		int length = args.length;
		System.out.println(length);
		if(length==0)
			System.out.println("no message");
		else
			System.out.println("List of args");
		for (int i = 0; i < args.length; i++) 
		{
			System.out.println(args[i]);
		}
	}
}

// To run
// Run --> run config --> arguments --> pass the args --> Run
