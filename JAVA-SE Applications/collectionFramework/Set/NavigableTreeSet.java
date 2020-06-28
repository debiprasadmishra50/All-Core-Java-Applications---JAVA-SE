package collectionFramework.Set;

import java.util.TreeSet;

public class NavigableTreeSet 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> s = new TreeSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		System.out.println(s);
		System.out.println(s.ceiling(15)); //Returns a value >= obj(15)
		System.out.println(s.floor(15)); //Returns a value <= obj(15)
		System.out.println(s.higher(25)); //Returns next element > obj(25)
		System.out.println(s.lower(25)); //Returns next element < obj(25)
		System.out.println(s.pollFirst()); //Retrieves and removes 1st element
		System.out.println(s);
		System.out.println(s.pollLast()); //Retrieves and removes last element
		System.out.println(s);
		System.out.println(s.descendingSet()); //Returns a set in descending order
		System.out.println(s);
		
	}
}
