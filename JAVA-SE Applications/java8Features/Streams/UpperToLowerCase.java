package java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("JOHN");
		list.add("DEVI");
		list.add("JIM");
		list.add("LIKE");
		System.out.println(list);
		
		List<String> list2 = list.stream().map((s)->s.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(list2);
	}
}
