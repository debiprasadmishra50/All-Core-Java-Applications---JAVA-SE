package MultiThreading;

public class SetPriority extends Thread 
{
	public static void main(String[] args) throws InterruptedException 
	{
		SetPriority sp = new SetPriority();
		sp.setPriority(MAX_PRIORITY);
		sp.setName("sp");
		sp.start();
		
		SetPriority sp1 = new SetPriority();
		sp1.setPriority(MIN_PRIORITY);
		sp1.setName("sp1");
		sp1.start();
		
		
		
//		for (int j = 1; j <= 50; j++) 
//		{
//			System.out.print(j+"\t");
//			Thread.sleep(1000);
//		}
	}
	public void run()  
	{
		System.out.println("Thread Name "+Thread.currentThread().getName());
		
//		for (int i = 1; i <= 50; i++) 
//		{
//			System.out.print(i+"\t");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) 
//			{
//				e.printStackTrace();
//				System.out.println("Child Thread Exiting");
//			}
//		}
	}
	
}
