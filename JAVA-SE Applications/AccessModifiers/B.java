package AccessModifiers;

public class B 
{
	public static void main(String[] args) 
	{
		A a = new A();
		//System.out.println(a.a); //Private //Not accessible outside class
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
	}
}
