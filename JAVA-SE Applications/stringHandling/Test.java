package stringHandling;

public class Test 	
{
	public static void main(String[] args) 
	{
		Product p = new Product(1,"Apple");
		
		System.out.println(p);
		System.out.println(p.id);
		System.out.println(p.name);
		
		String s = "123";
		Integer i = new Integer(456);
		System.out.println(s);
		System.out.println(i);
	}
}

