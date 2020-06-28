package collectionFramework.Set;

import java.util.TreeSet;

public class StringTreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<String> set = new TreeSet<String>(); //Orders the string set in alphabetical order
		set.add("ABC");
		set.add("XYZ");
		set.add("KJH");
		set.add("DTR");
		for (String res : set) 
			System.out.println(res); //It will print in the alphabatical order
	}
}
