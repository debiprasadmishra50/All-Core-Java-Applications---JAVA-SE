package collectionFramework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class Diff_Sets 
{
	public static void main(String[] args) 
	{
		Random obj = new Random();
		
		HashSet<Integer> set1 = new HashSet<>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
		TreeSet<Integer> set3 = new TreeSet<>();
		
		for(int i=1; i <= 5; i++)
		{
			int no = obj.nextInt(100);
			set1.add(no);
			set2.add(no);
			set3.add(no);
			System.out.print(no+"\t");
		}
		System.out.println("\n HashSet elements : "+set1); //Order is not maintained
		//Overcome by LinkedHashset
		System.out.println("LinkedHashSet elements : "+set2); //Insertion Order maintained
		System.out.println("TreeSet elements : "+set3); //Stored in ascending order
		
	}
}
/*
 52	22	90	85	92	
 HashSet elements : [52, 85, 22, 90, 92]
LinkedHashSet elements : [52, 22, 90, 85, 92]
TreeSet elements : [22, 52, 85, 90, 92]
 */
