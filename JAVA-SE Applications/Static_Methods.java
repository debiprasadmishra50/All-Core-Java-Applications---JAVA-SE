
public class Static_Methods 
{
	public static void main(String[] args) 
	{
		System.out.println("Inside Main");
		method1();
		Static_Methods.method1();
		new Static_Methods().method1();
	}
	static {
		System.out.println("Inside static Block");
		method1();
		Static_Methods.method1();
		new Static_Methods().method1();
	}
	static void method1()
	{
		System.out.println("Inside method 1");
	}
	
}
