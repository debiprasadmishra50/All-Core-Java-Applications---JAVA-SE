package collectionFramework.Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		HashMap<User_WeakHashMap, String> hmap = new HashMap<User_WeakHashMap , String>();
		WeakHashMap<User_WeakHashMap, String> whmap = new WeakHashMap<User_WeakHashMap , String>();
		
		User_WeakHashMap u = new User_WeakHashMap();
//		hmap.put(u, "Tom");
		whmap.put(u, "Raja");
		
		System.out.println(whmap);
//		System.out.println(hmap);
		
		u = null;
		
		System.gc();
		Thread.sleep(5000);
		
//		System.out.println(hmap); //garbage collection doesnot happen
		System.out.println(whmap); //garbage collection happens if the object reference doesnot refer to any other objects
	}
}
