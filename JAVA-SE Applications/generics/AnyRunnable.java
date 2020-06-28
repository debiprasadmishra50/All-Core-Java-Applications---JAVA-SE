package generics;

//public class AnyRunnable<T extends Runnable> 
public class AnyRunnable<T extends Thread & Comparable> 
{
	//Restricts to accept type of data that is child of Runnable like Thread, but wont accpet data like String or Integer...
}
