package java8Features;

public class LambdaDemo 
{
	public static void main(String[] args) 
	{
//		FunctionalInterfaceDemo f = new C();
//		f.myMethod();
		
		FunctionalInterfaceDemo f = ()->System.out.println("Inside myMethod()");
		f.myMethod();
		
	}
}
