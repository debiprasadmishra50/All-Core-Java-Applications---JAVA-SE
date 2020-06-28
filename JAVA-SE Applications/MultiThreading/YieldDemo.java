package MultiThreading;

public class YieldDemo 	
{
	public static void main(String[] args) 
	{
		MyThreadYield t = new MyThreadYield();
		t.start();
		
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("Main Thread");
		}
		
	}
}
