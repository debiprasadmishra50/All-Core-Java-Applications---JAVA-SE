package InnerClasses;

public class Outer3 
{
	void f1()
	{
		System.out.println("Outer f1()");
		class LocalInner //Class cannot be accessed outside the f1() method
		{
			void f2()
			{
				System.out.println("LocalInner f2()");
			}
		}
		LocalInner li = new LocalInner();
		li.f2();
	}
	public static void main(String[] args) 
	{
		Outer3 o = new Outer3();
		o.f1();
	}
}
