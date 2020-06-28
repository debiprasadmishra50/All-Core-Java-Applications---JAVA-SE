package generics;

import java.util.ArrayList;

public class TypeCastingProblem 
{
	public static void main(String[] args) 
	{
		String s[] = new String[10];
		s[0] = "John";
		s[1] = "Rob";
//		s[2] = 123;
		
//		ArrayList list = new ArrayList();
		ArrayList<String> list = new ArrayList<>();
		list.add("John");
		list.add("Rob");
//		list.add(123);
		
		String l1 = (String) list.get(0);
		String l2 = (String) list.get(1);
//		String l3 = (String) list.get(2);
		// will show ClassCastException  which is why generics is used
		System.out.println(l1);
		System.out.println(l2);
//		System.out.println(l3);
	}
}
