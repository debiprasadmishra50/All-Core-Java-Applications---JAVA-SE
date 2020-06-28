
public class Ref_In_Static_Method 
{
	static Ref_In_Static_Method t = new Ref_In_Static_Method();
	
	static {
		System.out.println(Ref_In_Static_Method.t); //Test@5305068a
//		Test.init();
		Ref_In_Static_Method.t = Ref_In_Static_Method.init();
	}
	public static void main(String[] args) 
	{
		System.out.println(Ref_In_Static_Method.t); //Test@1f32e575
	}
//	static void init()
//	{
//		Ref_In_Static_Method.t = new Ref_In_Static_Method();
//	}
	static Ref_In_Static_Method init()
	{
		return new Ref_In_Static_Method(); //returns objects of a static method
	}
}
// Each time constructor is called a new object is created, and it can have same or different reference name but the hashcode remains different
//Ref_In_Static_Method@5305068a
//Ref_In_Static_Method@1f32e575

