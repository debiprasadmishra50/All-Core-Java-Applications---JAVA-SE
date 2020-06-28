package JAVA10Features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo 
{
	public static void main(String[] args) 
	{
		List<Integer> list = List.of(15, 20, 27, 30);
		List<Integer> newList = list.stream().filter((i)-> i%3 ==0 ).collect(Collectors.toUnmodifiableList());

		//Collectors.toList() was able to add or modify new list further but this wont
//		newList.add(40);//UnsupportedOperationException //No compilation issue but run time exception 
		
		/*
		 * For List - Collectors.toUnmodifiableList()
		 * For Map - Collectors.toUnmodifiableMap()
		 * For Set - Collectors.toUnmodifiableSet()
		 */
		
		
	}
}
