package collectionFramework.list;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
//		ArrayList list = new ArrayList();
//		list.add(new Integer(100));
//		list.add(110);
//		list.add(30.45);
//		list.add("Hello");
		// We must use generics to restrict the list to a single type of data to avoid ClassCastException in future
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100));
		list.add(110);
		list.add(320);
		
		for (Object res : list) 
		{
			System.out.println(res);
		}
	}
}
