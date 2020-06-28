
public class AllConversions 
{
	public static void main(String[] args) 
	{
		int x = 100;
		String s = Integer.toString(x);
		Integer b = new Integer(s);
		int g = b.intValue();
		
		Integer c = new Integer(g);
		String d = c.toString();
		int e = Integer.parseInt(d);
	}
}
