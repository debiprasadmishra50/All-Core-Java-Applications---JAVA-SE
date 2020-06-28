package java8Features;

import java.util.function.Function;

public class FunctionTest 	
{	
	public static void main(String[] args) 
	{
		Function<String, Integer> f = (s)->s.length();
		System.out.println(f.apply("Debi"));
		System.out.println(f.apply("Hello"));
	}
}
