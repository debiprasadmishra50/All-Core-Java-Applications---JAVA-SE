package MultiThreading;

public class MultiThread extends Thread 
{
	public void run()  
	{
		System.out.println(Thread.currentThread().getName()); //Thread-0
		Thread.currentThread().setName("Print Numbers");
		System.out.println(Thread.currentThread().getName());//Print Numbers
		
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
	public static void main(String[] args) throws InterruptedException 
	{
		MultiThread mt = new MultiThread();
		mt.start();

		System.out.println(Thread.currentThread().getName()); //main
//		for (int j = 1; j <= 50; j++) 
//		{
//			System.out.print(j+"\t");
//			Thread.sleep(1000);
//		}
	}
}
