package synchronizatiom.blocks;

public class DisplayMessage 
{
	public void sayHello(String name) throws InterruptedException
	{
		//Any code can go here
//		synchronized (this)
//		synchronized (DisplayMessage.class)
		synchronized(new DisplayMessage())
		{
			for (int i = 1; i <= 10; i++) 
			{
				System.out.println("How are you "+name);
				Thread.sleep(1000);
			}
		}
	}
}
