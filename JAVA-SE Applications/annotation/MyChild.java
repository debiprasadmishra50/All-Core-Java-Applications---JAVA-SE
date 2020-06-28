package annotation;

public class MyChild extends MyParent
{
	public static void main(String[] args) 
	{
		MyChild m = new MyChild();
		m.fun();
	}
	//@Override //To ensure that the over-riding is actually done or not
	void fun(int a)
	{
		System.out.println("Child fun()");
	}
}
