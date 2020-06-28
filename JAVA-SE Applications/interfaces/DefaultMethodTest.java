package interfaces;

public class DefaultMethodTest implements DefaultMethods,X
{
//Duplicate default methods named fun with the parameters () and () are inherited from the types X and DefaultMethods
	
	public void fun()
	{
		System.out.println("Inside Class fun()");
	}
}
