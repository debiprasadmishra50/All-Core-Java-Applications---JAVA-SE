package JAVA11Features;

import java.util.stream.Collectors;

public class StringUpdates 
{
	public static void main(String[] args) 
	{
		String s = "                           ";
		System.out.println(s);
		System.out.println(s.isBlank()); //true
		s = "Hello\n I \n am \n debi";
		System.out.println(s);
		System.out.println(s.lines().collect(Collectors.toList()));
		
		s = "Debi is nice";
		System.out.println(s);
		char c = '\u2000';
		s = s+c;
		System.out.println(s);
		System.out.println(s.strip());
		System.out.println(s.stripLeading());
		System.out.println(s.stripTrailing());
		
		System.out.println("-".repeat(20));
	}
}
