package MultiThreading;

public class CheckProcessor implements Runnable 
{
	public void run() 
	{
		System.out.println("Process the Checks");
		
	}
	public static void main(String[] args) 
	{
		CheckProcessor cp = new CheckProcessor();
		Thread th = new Thread(cp);
		th.start();
	}
	
}
