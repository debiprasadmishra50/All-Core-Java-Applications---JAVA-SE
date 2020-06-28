package synchronizatiom.classlock;

public class SynchronizationDemo 
{
	public static void main(String[] args) 
	{
	
		MyThread t1 = new MyThread("Debi");
		MyThread t2 = new MyThread("Mark");
		
		t1.start();
		t2.start();
	}
}
