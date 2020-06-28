package JAVA10Features;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VarConcept 
{
	public static void main(String[] args) 
	{
		int x = 10;
		float f = 20.0f;
		String s = "ABF";
		
		var i = 10;
		var a = 20.0f;
		var l = "ABF";
		
		
		System.out.println(x);
		System.out.println(f);
		System.out.println(s);
		System.out.println(i);
		System.out.println(a);
		System.out.println(l);
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		var map1 = new HashMap<String, List<String>>(); //Both are equal
		
		for(Map.Entry<String, List<String>> entry:map.entrySet()) {}
		for(var entry:map.entrySet()) { //Both are equal
			var value = entry.getValue();
		}
		
		
	}
}
