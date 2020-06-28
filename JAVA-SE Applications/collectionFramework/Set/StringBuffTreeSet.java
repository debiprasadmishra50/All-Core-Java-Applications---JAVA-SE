package collectionFramework.Set;

import java.util.TreeSet;

public class StringBuffTreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<StringBuffer> set = new TreeSet<StringBuffer>(); //Orders the string set in alphabetical order
		set.add(new StringBuffer("ABC"));
		set.add(new StringBuffer("XYZ"));
		set.add(new StringBuffer("KJH"));
		set.add(new StringBuffer("DTR"));
		for (StringBuffer res : set) 
			System.out.println(res);
	}
}
