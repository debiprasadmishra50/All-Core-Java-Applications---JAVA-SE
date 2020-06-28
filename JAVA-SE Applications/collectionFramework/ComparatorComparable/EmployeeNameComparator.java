package collectionFramework.ComparatorComparable;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<EmployeeComparable> 
{
	public int compare(EmployeeComparable o1, EmployeeComparable o2) {
		String s1 = o1.name;
		String s2 = o2.name;
		
		return s1.compareTo(s2);
	}

}
