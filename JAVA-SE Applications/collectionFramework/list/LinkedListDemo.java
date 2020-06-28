package collectionFramework.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		Object obj[] = new Object[100000];
		for(int i = 0; i < obj.length; i++)
		{
			obj[i] = new Object();
		}
		
		LinkedList<Object> list = new LinkedList<Object>();
		ArrayList<Object> list1 = new ArrayList<Object>();
		
		long start = System.currentTimeMillis();
		for (Object object : obj) 
		{
			list.add(object);
//			list1.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken : "+(end-start)+" milisecs");
	}
}
