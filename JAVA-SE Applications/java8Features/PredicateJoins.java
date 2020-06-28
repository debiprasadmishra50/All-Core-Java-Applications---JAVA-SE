package java8Features;

import java.util.function.Predicate;

public class PredicateJoins 
{
	public static void main(String[] args) 
	{
		int x[] = {0,10,20,30,40,50,60,70,7,73};
		
		Predicate<Integer> p = (i)->(i > 10); //Check if i > 10
		Predicate<Integer> p2 = (i)->(i%2 == 0); // Check if even
		
		System.out.println("Greater than 10 : ");
		method(p, x);
		
		System.out.println("\nEven numbers : ");
		method(p2,x);
		
		System.out.println("\nNot Greater than 10 : ");
		method(p.negate(), x);
		
		System.out.println("\nGreater than 10 AND even");
		method(p.and(p2), x);
		
		System.out.println("\nGreater than 10 OR even");
		method(p.or(p2), x);
	}
	static void method(Predicate<Integer> p , int x[])
	{
		for (int eachValue : x) 
		{
			if(p.test(eachValue))
				System.out.print(eachValue+"\t");
		}
	}
}
