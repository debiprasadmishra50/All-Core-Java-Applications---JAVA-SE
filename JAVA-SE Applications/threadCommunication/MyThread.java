package threadCommunication;

public class MyThread extends Thread
{
	int total;
	public void run() 
	{
		System.out.println("Child Thread is going to calculate");
		synchronized (this) //child thread gets the lock
		{
			for (int i = 1; i <= 100; i++) 
			{
				total = total + i;
			}
			try 
			{
				Thread.sleep(3000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			this.notify(); //child thread lock is evoked and returned to main thread
		}
	}
}
