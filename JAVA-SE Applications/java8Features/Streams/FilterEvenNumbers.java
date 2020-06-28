package java8Features.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i++)
			list.add(i);
		System.out.println(list);
//		System.out.println("Filter by traditional method");
//		ArrayList<Integer> list2 = new ArrayList<>();
//		for (Integer i : list) 
//		{
//			if(i%2 == 0)
//				list2.add(i);
//		}
		
		System.out.println("Filtering by Streams");
		List<Integer> list2 = list.stream().filter((i)->i%2 == 0).collect(Collectors.toList());
		System.out.println(list2);
		
		long count = list.stream().filter((i)->i%2 == 0).count();
		System.out.println("Mo of even numbers are : "+count);
		
//		Comparator<Integer> comp = (i1,i2)->i2.compareTo(i1);// For Descending
//		List<Integer> list3 = list.stream().sorted(comp).collect(Collectors.toList());
		
		Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);//For ascending which is natural order of sorting
		List<Integer> list3 = list.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(list3);
		
		Integer max = list.stream().max(comp).get();
		System.out.println(max);
		
		Integer min = list.stream().min(comp).get();
		System.out.println(min);
		
		list.stream().forEach(i->System.out.print(i+"\t"));
			
		
	}
}
