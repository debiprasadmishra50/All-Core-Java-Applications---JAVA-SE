package InnerClasses;

public class Outer2 
{
	private static int x = 50;
	private int y;
	
	Outer2(int y) 
	{
		this.y = y;
	}
	
	class Inner
	{
		private int y;
		Inner(int y)
		{
			this.y = y;
		}
		void f2()
		{
			System.out.println("Inner class non-static method f2()");
			System.out.println("Outer class static X "+Outer2.x); //50
			System.out.println("Outer class non-static y "+Outer2.this.y); //80
			System.out.println("Inner Class non-static y "+this.y); //30
			
		}
//		static void f3() //static not allowed inside non-static
//		{}
	}
	public static void main(String[] args) 
	{
		Outer2 outer = new Outer2(80);
		outer.f1();
		
		Outer2.Inner inner = outer.new Inner(30);
		inner.f2();
		System.out.println(inner.y); //30
	}
	
	void f1()
	{
		System.out.println("Outer class non-static method f1()");
	}
}
/*
 * Outer class non-static method f1()
Inner class non-static method f2()
Outer class static X 50
Outer class non-static y 80
Inner Class non-static y 30
30
*/
