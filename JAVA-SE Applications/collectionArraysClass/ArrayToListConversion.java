package collectionArraysClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToListConversion 
{
	public static void main(String[] args) 
	{
		String s[] = {"Z","A","R","Q","P"};
		for (String res : s) 
			System.out.print(res+"\t");
		
		System.out.println();
		List<String> list = Arrays.asList(s);
		System.out.println(list);
		
		//To sort the list
		Collections.sort(list);
		System.out.println(list);
		
	}
}
