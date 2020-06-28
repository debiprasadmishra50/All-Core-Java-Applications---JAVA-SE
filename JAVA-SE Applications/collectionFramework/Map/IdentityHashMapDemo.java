package collectionFramework.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo 
{
	public static void main(String[] args) 
	{
		IdentityHashMap<Integer, String> ihmap = new IdentityHashMap<Integer, String>(); //Will hold the duplicate keys and respective values
		HashMap<Integer, String> hmap = new HashMap<Integer , String>(); //(Duplicate keys gets replaced by new keys and values)
		
		Integer id1 = new Integer(10);
		Integer id2 = new Integer(10);
		
		hmap.put(id1, "Debi");
		hmap.put(id2, "Raja");
		
		ihmap.put(id1, "Debi");
		ihmap.put(id2, "Raja");
		
		System.out.println(hmap);
		System.out.println(ihmap);
	}
}
