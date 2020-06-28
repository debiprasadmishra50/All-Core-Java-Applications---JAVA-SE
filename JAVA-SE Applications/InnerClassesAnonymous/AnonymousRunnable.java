package InnerClassesAnonymous;

public class AnonymousRunnable 
{
	public static void main(String[] args) 
	{
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Anonymous Runnable Class Implementation");
			}
		});
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}
