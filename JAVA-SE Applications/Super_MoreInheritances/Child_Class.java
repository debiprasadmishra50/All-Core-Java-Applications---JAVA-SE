package Super_MoreInheritances;

public class Child_Class extends Super_Class 
{
	public Child_Class() 
	{
		this(10);
		System.out.println("No Args Child_Class constructor");
	}
	public Child_Class(int x) 
	{
		super(x);
		System.out.println("Args Child_Class constructor");
	}
	public static void main(String[] args) 
	{
		Child_Class c = new Child_Class();
		
	}
}

//No args Suoer_Class constructor
//args Suoer_Class constructor
//Args Child_Class constructor
//No Args Child_Class constructor

