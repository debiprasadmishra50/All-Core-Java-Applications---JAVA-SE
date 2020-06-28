package generics;

public class MyGenericClass<T> 
{
	T obj;
	MyGenericClass(T obj) 
	{
		this.obj = obj;
	}
	
	public void displayObjectDetails()
	{
		System.out.println("Type of Object : "+obj.getClass().getName());
	}
	public T getObject()
	{
		return obj;
	}
}
