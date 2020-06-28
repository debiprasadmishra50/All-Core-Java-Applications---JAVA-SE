package collectionFramework.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class HashSetDemo 
{
	public static void main(String[] args) 
	{
		Random obj = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= 10; i++)
		{
			int no = obj.nextInt(5);
			list.add(no);
		}
		System.out.println("List : "+list);
		
		HashSet<Integer> set = new HashSet<Integer>(list); //Doesn't allow duplicate values
		System.out.println("Set : "+set);
		
		
	}
}
