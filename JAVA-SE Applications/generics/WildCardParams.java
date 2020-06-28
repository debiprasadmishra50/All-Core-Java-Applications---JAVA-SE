package generics;

import java.util.ArrayList;

public class WildCardParams 
{
	public static void main(String[] args) 
	{
		WildCardParams wcp = new WildCardParams();
		wcp.myMethods(new ArrayList<Thread>());
//		wcp.myMethods(new ArrayList<String>()); //Cant be used
		wcp.myMethods(new ArrayList<MyClass>()); //MyClass class extends Thread Class
	}
//	public void myMethods(ArrayList<?> list)
	public void myMethods(ArrayList<? extends Thread> list) //Will now be able to pass a type which is a thread or any class that extends thread
	{
//		<?> is wild cards and it only will accept null values
		list.add(null);
//		list.add("Debi");
		// Now i can only pass an Arraylist of type Thread
	}
}
