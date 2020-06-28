package collectionArraysClass;

import java.util.Arrays;

public class ArraysSort 
{
	public static void main(String[] args) 
	{
		int a[] = {20,10,50,30};
		System.out.println("Before Sort : ");
		for (int i : a) 
			System.out.print(i+"\t");
		
		Arrays.sort(a);
		System.out.println("\nAfter Sort : ");
		for (int i : a) 
			System.out.print(i+"\t");
		
		System.out.println();
		String s[] = {"Z","A","R","Q","P"};
		System.out.println(Arrays.binarySearch(s, "Z", new MyComparator()));
		Arrays.sort(s);
		for (String res : s) 
			System.out.print(res+"\t");
System.out.println();
		Arrays.sort(s, new MyComparator());
		for (String res : s) 
			System.out.print(res+"\t");
		
	}
}
