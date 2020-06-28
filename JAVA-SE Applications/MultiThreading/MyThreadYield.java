package MultiThreading;

public class MyThreadYield extends Thread 
{
	public void run()
	{
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Child thread");
			Thread.yield();
		}
	}
	public static void main(String[] args) 
	{
		
	}
}
