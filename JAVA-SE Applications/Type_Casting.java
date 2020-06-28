
public class Type_Casting 
{
	public static void main(String[] args) 
	{
		// implicit casting
		byte b = 100;
		int i = b;
		System.out.println(i); //100
		long l = i;
		
		char c = 'A';
		int x = c;
		System.out.println(x); //Ascii value //65
		
		// Explicit casting
		int a = 100;
		byte z = (byte)i;
		
		int f = 65;
		char ch = (char)f;
		System.out.println(ch); //A
		
		
		int y = 130;
		byte v = (byte)y;
		System.out.println(v);//-126
		
		int m = 612;
		byte n = (byte)m;
		char o = (char)n;
		System.out.println(o); //d
	}
}
