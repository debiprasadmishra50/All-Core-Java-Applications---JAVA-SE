package collectionFramework.ComparatorComparable;

import java.util.TreeSet;

public class Employee 
{
	public static void main(String[] args) 
	{
		TreeSet<EmployeeComparable> set = new TreeSet<EmployeeComparable>(new EmployeeNameComparator());
		set.add(new EmployeeComparable(100, "Obama"));
		set.add(new EmployeeComparable(400, "Debi"));
		set.add(new EmployeeComparable(200, "Raja"));
		set.add(new EmployeeComparable(500, "Rani"));
		
		for (EmployeeComparable ec : set) 
		{
			System.out.println(ec.id);
			System.out.println(ec.name);
		}
	}
}
