package polymorphism;

public class MacBook implements Apple_Laptop 
{
	public void start()
	{
		System.out.println("MacBook start()");
	}
	public void shutDown()
	{
		System.out.println("MacBook shutDown()");
	}
}
