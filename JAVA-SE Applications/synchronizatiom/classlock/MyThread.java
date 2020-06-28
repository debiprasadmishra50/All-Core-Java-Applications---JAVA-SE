package synchronizatiom.classlock;

public class MyThread extends Thread 
{
	String name;
	
	MyThread(String name)
	{
		//this.instance/class variable = local/argument variable
		this.name = name;
	}
	public void run()
	{
		DisplayMessage.sayHello(name);
	}
}
