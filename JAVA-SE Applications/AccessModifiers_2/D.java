package AccessModifiers_2;

import AccessModifiers.A;

public class D 
{
	public static void main(String[] args) 
	{
		A a = new A();
		//System.out.println(a.a);
//		System.out.println(a.b);
//		System.out.println(a.c);
		System.out.println(a.d); //public //only can be accessed by parent class object
		
		D d = new D();
//		System.out.println(d.c);
//		System.out.println(d.d);
	}
}
