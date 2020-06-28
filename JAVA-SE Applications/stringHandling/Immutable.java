package stringHandling;

public class Immutable 
{
	public static void main(String[] args) 
	{
		// String is an immutable class i.e. contents of the objects can not be changed without being referenced
		String s1 = "Hello";
		String s2 = "world";
		
		System.out.println("Before Concat"+"\ns1 : "+s1+"\ns2 : "+s2);
		
		s1.concat(s2);
		
		System.out.println("After Concat"+"\ns1 : "+s1+"\ns2 : "+s2);
		
	}
}
