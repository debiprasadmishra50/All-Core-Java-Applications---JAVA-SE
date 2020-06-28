
public class Non_Static 
{
	int a; //non-static variable
	Non_Static() //constructor
	{
		System.out.println("Constructor");
	}
	
	{ //non-static block
		System.out.println("Non static block");
	}
	public static void main(String[] args) 
	{
		System.out.println("main mehtod");
		System.out.println(new Non_Static().a);
		Non_Static ns = new Non_Static(); //object creation by calling constructor
		
		ns.doSomething();
	}
	static {
		System.out.println("Static block");
	}
	void doSomething()
	{
		System.out.println("doSomething method");
	}
}
