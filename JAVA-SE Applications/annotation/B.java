package annotation;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("deprecation")
public class B extends A 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		A a = new A();
//		System.out.println(a); // IF object is not used
		
		a.fun();
		a.show();
		System.out.println(a.a);
		
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		System.out.println(list);
		
	}
}
