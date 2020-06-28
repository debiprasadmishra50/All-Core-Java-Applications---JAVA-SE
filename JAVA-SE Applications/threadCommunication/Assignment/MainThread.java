package threadCommunication.Assignment;

public class MainThread 
{
	public static void main(String[] args) throws InterruptedException 
	{
		EvenNumbersThread e = new EvenNumbersThread();
		OddNumbersThread o = new OddNumbersThread();
		e.start();
		
		
		synchronized (e) 
		{
			System.out.println("Display first 10 numbers");
			for (int i = 1; i <= 10; i++) 
				System.out.print(i+"\t");
			System.out.println("\n Even numbers are");
			e.wait();
			o.start();
			System.out.println("\n Odd numbers are");
			o.wait();
		}
	}
}
