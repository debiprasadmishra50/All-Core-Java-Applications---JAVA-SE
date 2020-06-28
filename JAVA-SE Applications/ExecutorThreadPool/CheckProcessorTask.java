package ExecutorThreadPool;

public class CheckProcessorTask implements Runnable
{
	String name;
	
	public CheckProcessorTask(String name) 
	{
		this.name = name;
	}
	public void run() 
	{
		System.out.println(name+" CheckProcessor Has Began Processing the check "+Thread.currentThread().getName());
		
		try 
		{
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println(name+" CheckProcessor has completed processing the check "+Thread.currentThread().getName());
	}
	
}
