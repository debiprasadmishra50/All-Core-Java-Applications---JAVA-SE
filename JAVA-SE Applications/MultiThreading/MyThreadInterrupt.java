package MultiThreading;

public class MyThreadInterrupt extends Thread
{
	public void run() 
	{
		try
		{
			for (int i = 1; i <= 10; i++) 
			{
				System.out.println("Lazy Thread");
				Thread.sleep(2000);
			}
		}catch (InterruptedException e) 
		{
			System.out.println("Got Interrupted");
		}
	}
}
