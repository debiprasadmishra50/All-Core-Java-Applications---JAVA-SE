package collectionFramework.ComparatorComparable;

import java.util.TreeSet;

public class StringTreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> set = new TreeSet<String>(new StringComparator()); //Orders the string set in alphabetical order
		set.add("ABCVDC");
		set.add("XYFFZ");
		set.add("KJHHRFSHFS");
		set.add("DTRF");
		for (String res : set) 
			System.out.println(res); //It will print in the min-max length order 
	}
}
