package collectionFramework.Map;

import java.util.TreeMap;

public class TreeMapDemo 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(10, "DEBI");
		map.put(11, "RAJA");
		map.put(12, "RANI");
		map.put(13, "HARI");
		map.put(14, "JOHN");
		map.put(15, "ROCK");
		
		System.out.println(map);
		System.out.println(map.floorKey(12)); //<=
		System.out.println(map.lowerKey(12)); //<
		System.out.println(map.ceilingKey(12)); //=
		System.out.println(map.higherKey(12)); //>
		System.out.println(map.pollFirstEntry()); //Retrieve and remove 1st key & value to enter
		System.out.println(map.pollLastEntry()); //Retrieve and remove last key & value to enter
		System.out.println(map.descendingMap()); //Returns amap in descending order
		System.out.println(map);
		
		
	}
}
