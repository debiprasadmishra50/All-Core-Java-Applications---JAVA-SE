package synchronizatiom;

public class MyThread extends Thread 
{
	DisplayMessage ds;
	String name;
	
	MyThread(DisplayMessage ds , String name)
	{
		//this.instance/class variable = local/argument variable
		this.ds = ds;
		this.name = name;
	}
	public void run()
	{
		try 
		{
			ds.sayHello(name);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
