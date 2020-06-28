
public class Wrapper_Class 
{
	public static void main(String[] args) 
	{
		int x = 100;
		Integer i = Integer.valueOf(x);
		int z = i.intValue();
		System.out.println(x+"\t"+i+"\t"+z);
		
		int x1 = 10;
		Integer x2 = new Integer (x1) ; //Boxing
		Integer x3 = x1; // Auto-Boxing
		System.out.println(x1 +"\t"+ x2 +"\t"+ x3);

		Integer y1 = 11;
		int y2 = Integer.valueOf (y1); //Unboxing
		int y3 = y1; //Auto-Boxing
		System.out.println(y1 +"\t"+ y2 +"\t"+ y3);
		
		//Primitive and string
		byte a = 100;
		String s = Byte.toString(a);
		byte c = Byte.parseByte(s);
		System.out.println(a+"\t"+s+"\t"+c);
	}
}
/* 100 100	100
10	10	10
11	11	11
100	100	100

*/
