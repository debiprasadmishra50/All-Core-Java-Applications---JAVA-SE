package MultiThreading;

public class InterruptDemo 
{
	public static void main(String[] args) 
	{
		MyThreadInterrupt mt = new MyThreadInterrupt();
		mt.start();
		
		mt.interrupt();
		
		System.out.println("End of main Thread");
	}
}
