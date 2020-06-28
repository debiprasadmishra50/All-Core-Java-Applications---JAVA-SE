
public class Static_Variable 
{
	static int a ;
	int b;
	//default value of a global variable is the default value of the datatype
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(Static_Variable.a);
		System.out.println(new Static_Variable().a);
		
		//System.out.println(b); //error
		//System.out.println(Static_Variable.b); //error
		System.out.println(new Static_Variable().b);
		
	}
}
