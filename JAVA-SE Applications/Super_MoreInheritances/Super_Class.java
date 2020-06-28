package Super_MoreInheritances;

public class Super_Class 
{
	int x;
	public Super_Class()
	{
		System.out.println("No args Suoer_Class constructor");
	}
	public Super_Class(int x)
	{
		this();
		this.x = x;
		System.out.println("args Suoer_Class constructor");
	}
}
