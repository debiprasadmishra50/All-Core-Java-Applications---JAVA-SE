package exception_Handling;

public class Assignment 
{
	public static void main(String[] args) //throws InterruptedException 
	{
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) 
		{
			try
			{
				throw new MyThreadException();
			}catch (Exception e1) 
			{
				
			}
		}
	}
}
