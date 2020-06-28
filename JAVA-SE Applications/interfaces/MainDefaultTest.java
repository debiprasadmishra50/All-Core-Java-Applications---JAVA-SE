package interfaces;

public class MainDefaultTest 
{
	public static void main(String[] args) 
	{
		DefaultMethods d = new DefaultMethodTest();
		d.fun(); //Searches in child, if got, print, else search in parent and print
		//Run Time Polymorphism
	}
}
