package collectionFramework.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1 ; i<= 10; i++)
		{
			list.add(i);
		}
		System.out.println("List : "+list);
		list.add(2, 100);
		System.out.println("List after Insert : "+list);
		list.set(3, 200);
		System.out.println("List after replacement : "+list);
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(22);
		list1.add(33);
		System.out.println("Second List : "+list1);
		
		list.addAll(4,list1);
		System.out.println("First List after second list insertion : "+list);
		
		if(list.contains(11))
			System.out.println("List has the value");
		else
			System.out.println("List doesnot have the value");
		
		System.out.println("Elements in the list are : (by for)");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("Elements in the list are : (by foreach)");
		for (Integer res : list) 
		{
			System.out.println(res);
		}
		
		//To remove
		System.out.println(list);
		list.remove(3);
		System.out.println("After Deletion : "+list);
		
		
	}
}
