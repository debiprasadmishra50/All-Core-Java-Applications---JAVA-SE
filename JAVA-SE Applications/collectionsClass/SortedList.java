package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class SortedList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		list.add("Z");
		list.add("A");
		list.add("X");
		list.add("B");
		
		System.out.println("Before Sorting : "+list);
		Collections.sort(list);
		System.out.println("After sorting : "+list); //Sorting in forward direction
		System.out.println(Collections.binarySearch(list, "Z"));
		Collections.sort(list,new MyComparator());
		System.out.println("After sorting : "+list); //Sorting in reversing direction
		System.out.println(Collections.binarySearch(list, "Z", new MyComparator()));
	}
}
