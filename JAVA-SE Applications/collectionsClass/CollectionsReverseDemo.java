package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(8);
		list.add(50);
		list.add(78);
		list.add(22);
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
}
