package java8Features;

import java.util.function.Predicate;

public class GreaterThanTwentyPredicate 
{
	public static void main(String[] args) 
	{
		Predicate<Integer> p = (i)->(i>20);
		System.out.println(p.test(15)); //false
		System.out.println(p.test(25)); //true
		System.out.println(p.test(30)); //true
		
	}
}
