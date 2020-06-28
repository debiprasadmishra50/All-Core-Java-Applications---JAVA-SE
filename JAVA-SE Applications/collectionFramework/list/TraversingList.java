package collectionFramework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class TraversingList 	
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random obj = new Random();
		for (int i = 1; i <= 10 ; i++)
		{
			int no = obj.nextInt(20);
			list.add(no);
			System.out.print(no+"\t");
		}
		System.out.println("\nNow Traversing");
		
		System.out.println(list);
		for(int i = 0; i < list.size() ; i++)
			System.out.print(list.get(i)+"\t");
System.out.println();
		for (Integer res : list) 
			System.out.print(res+"\t");
System.out.println();
		Iterator<Integer> itr = list.iterator(); //Can Only go in forward
		while (itr.hasNext()) 
			System.out.print(itr.next()+"\t");
System.out.println();
		ListIterator<Integer> ltr = list.listIterator(); //Can go forward and Backward
		while (ltr.hasNext()) 
			System.out.print(ltr.next()+"\t");
System.out.println();
		while (ltr.hasPrevious()) 
			System.out.print(ltr.previous()+"\t");		
System.out.println();
		Enumeration e = Collections.enumeration(list);
		while (e.hasMoreElements())
			System.out.print(e.nextElement()+"\t");
		
		
		

		
	}
}
