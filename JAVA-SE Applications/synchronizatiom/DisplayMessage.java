package synchronizatiom;

public class DisplayMessage 
{
	public synchronized void sayHello(String name) throws InterruptedException
	{
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("How are you "+name);
			Thread.sleep(1000);
		}
	}
}
