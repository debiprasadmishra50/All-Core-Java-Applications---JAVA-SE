package InnerClasses;

public class Outer 
{
	static void f1()
	{
		System.out.println("Outer f1() Static method");
	}
	static class Inner
	{
		static void f2()
		{
			System.out.println("Inner f2() static method");
		}
		void f3()
		{
			System.out.println("Non static method inside Inner Class");
		}
	}
	public static void main(String[] args) 
	{
		Outer.f1();
		Outer.Inner.f2();
		Outer.Inner obj = new Outer.Inner();
		obj.f3();
	}
}
