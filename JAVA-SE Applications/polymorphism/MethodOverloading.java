package polymorphism;
//Compile time polymorphism
public class MethodOverloading 
{
	void add(int a,int b)
	{
		int res = a+b;
		System.out.println("Result is : "+res);
	}
	void add(float a,float b)
	{
		float res = a+b;
		System.out.println("Result is : "+res);
	}
	void add(int a,int b, int c)
	{
		int res = a+b+c;
		System.out.println("Result is : "+res);
	}
	public static void main(String[] args) 
	{
		MethodOverloading m = new MethodOverloading();
		m.add(10, 20);
		m.add(30f, 40.2f);
		m.add(20, 30, 40);
	}
}
