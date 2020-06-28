package java8Features;

import java.util.function.Predicate;

public class LengthOfStringPredicate 
{
	public static void main(String[] args) 
	{
		Predicate<String> p = (s)->(s.length() > 5);
		System.out.println(p.test("Debi")); //false
		System.out.println(p.test("HGUHVGF")); //true
		System.out.println(p.test("KKDDKDKDKDKD")); //true
		
	}
}
