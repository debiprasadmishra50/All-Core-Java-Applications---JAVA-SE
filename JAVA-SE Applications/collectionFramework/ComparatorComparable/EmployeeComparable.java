package collectionFramework.ComparatorComparable;

public class EmployeeComparable implements Comparable<EmployeeComparable>
{
	int id;
	String name;
	
	EmployeeComparable(int id, String name) 
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int compareTo(EmployeeComparable o) 
	{
		int id1 = this.id;
		int id2 = o.id;
		
		if(id1 < id2)
			return -1;
		else if(id1 > id2)
			return 1;
		else
			return 0;
		
	}
}
