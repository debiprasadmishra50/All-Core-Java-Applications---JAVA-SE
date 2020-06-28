package threadCommunication;

public class MainThread 
{
	public static void main(String[] args) throws InterruptedException 
	{	//main thread runs
		MyThread t = new MyThread();
		t.start(); //starts the child thread
		
		synchronized (t) { //synchronized block // main thread gets the lock
			System.out.println("Main Thread is going to wait");
			t.wait(); //main thread lock is evoked
			System.out.println("Main Thread Notified");
			System.out.println(t.total);
		}
	}
}
