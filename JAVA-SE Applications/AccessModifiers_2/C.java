package AccessModifiers_2;

import AccessModifiers.A;

public class C extends A 
{
	public static void main(String[] args) 
	{
		A a = new A();
		//System.out.println(a.a); // Private
		//System.out.println(a.b); //Default
		//System.out.println(a.c); //protected, cant be accessed by parent class obj
		System.out.println(a.d); //public
		
		C c = new C(); //child class object created
		System.out.println(c.c); // protected member c accessed by child class object
		System.out.println(c.d); //public accessed by child class object
	}
}
