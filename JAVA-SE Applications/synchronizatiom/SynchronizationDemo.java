package synchronizatiom;

public class SynchronizationDemo 
{
	public static void main(String[] args) 
	{
		DisplayMessage ds = new DisplayMessage();
		MyThread t1 = new MyThread(ds, "Debi");
		MyThread t2 = new MyThread(ds, "Mark");
		
		t1.start();
		t2.start();
	}
}
