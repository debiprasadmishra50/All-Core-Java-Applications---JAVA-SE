package generics;

public class AnyRunnableTest 
{
	public static void main(String[] args) 
	{
//		AnyRunnable<Thread> th = new AnyRunnable<Thread>();
		AnyRunnable<MyClass> th = new AnyRunnable<MyClass>(); //For multiple restrictions CREATE A NEW CLASS that extends and implements respective classes & interfaces and use that inside <>
		
//		AnyRunnable<String> th = new AnyRunnable<>(); //Restricted
		
	}
}
