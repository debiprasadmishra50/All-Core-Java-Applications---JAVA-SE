package collectionFramework.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Debi", 70); 	//String is key and integer is value
		map.put("Tom", 80);
		map.put("Steve", 90);
		map.put("Raja", 1000);
		
		Set<String> keySet = map.keySet();
		System.out.println("Keys : "+keySet);
		
		Collection<Integer> values = map.values();
		System.out.println("Values P: "+values);
		
		//Not ordered
		for (String key : keySet) 
		{
			System.out.println("Key : "+key+" With Value : "+map.get(key));
		}
	}
}
