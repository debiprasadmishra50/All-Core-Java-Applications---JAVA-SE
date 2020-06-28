package java8Features;

public class MethodReferencing 
{
	public static void myMethod()
	{
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("child Thread");
		}
	}
	public static void main(String[] args) 
	{
		Runnable r = MethodReferencing::myMethod;
		
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0; i <= 10; i++)
		{
			System.out.println("Parent Thread");
		}
	}
}
