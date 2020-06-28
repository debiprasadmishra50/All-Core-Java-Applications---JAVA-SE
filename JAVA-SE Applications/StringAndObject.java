
public class StringAndObject 
{
	public static void main(String[] args) 
	{
		long x = 1000;
		Long y = Long.valueOf(x);
		
		String s = y.toString();
		long z = Long.valueOf(s);
		System.out.println(x+"\t"+y+"\t"+s+"\t"+z); //1000	1000	1000	1000
		
		
	}
}
