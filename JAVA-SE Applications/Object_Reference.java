
public class Object_Reference 
{
	static Object_Reference t;
	static {
		Object_Reference t1 = new Object_Reference();
		System.out.println(t1); //Test@5305068a // hashcode
	
		System.out.println(t); //NULL
		System.out.println(Object_Reference.t); //NULL
		Object_Reference.t = new Object_Reference(); // Till the constructor is called the reference value remains as NULL
	}
	public static void main(String[] args) 
	{
		System.out.println(Object_Reference.t); //Test@1f32e575 //Hashcode
	}
}
