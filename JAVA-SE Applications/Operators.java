
public class Operators 
{
	public static void main(String[] args) 
	{	
		// Unary Operators --> ++ , --
//		int x = 10;
//		int a = x++; // a = 10, x = 11
//		int b = ++x; // x = 12, b = 12
//		int c = x--; // c = 12, x = 11
//		int d = --x; // x = 10, d = 10
//		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
//		int i = 10;
//		System.out.println(i++ +"\t"+ i);
		
		//Arithmetic --> + - * / %
//		int x = 20, y = 10;
//		System.out.println(x+y);
//		System.out.println(x-y);
//		System.out.println(x*y);
//		System.out.println(x/y);
//		System.out.println(x%y); // reminder
		
		// String concat operator
//		String s1 = "XYZ";
//		String s2 = "ABC";
//		System.out.println(s1+s2); // Concat to //XYZABC
//		int a = 10,b = 20,c = 30;
//		System.out.println(a+b+c);
//		System.out.println(s1+a+b+c); //XYZ102030
//		System.out.println(a+b+c+s1); //60XYZ
//		System.out.println(a+b+s1+c+a); //30XYZ3010 //a+b = 20 then append XYZ3010
		
		
		//Relational / comparison --> > < <= >= 
		// equality --> = !=
//		System.out.println(10>2); //true
//		System.out.println('a' < 10); //false
//		System.out.println('a' > 'A'); //true
//		//System.out.println(true > false); //error // can't aply to boolean values.
//		System.out.println('a' > 900); //false
//		System.out.println((int)'a');
//		System.out.println((int)'A');
		
		
		//Bit-wise operator --> & (true if both args are true)
		//						| (true if either of args is true) 
		// 						^ (true if both args are different 
//		System.out.println(true & false); // false
//		System.out.println(true & true); //true
//		System.out.println(true | false); //true
//		System.out.println(true | true); //true
//		System.out.println(true ^ true); //false
//		System.out.println(true ^ false); //true
//		
//		System.out.println(4&5); //4
//		System.out.println(4|5); //5
//		System.out.println(4^5); //1
		
		// Complement operator
//				~ --> Bitwise unary - turn each bit into complement
//				! --> boolena complement - ture - false & vice versa
		
//		System.out.println(~4); //5
//		System.out.println(!true); //false
	
		// Short-Circuit operator --> && ||
		// applied to boolean only
//		boolean x = true,y = false;
//		if(x&&y)
//			System.out.println("inside if");
//		if(x||y)
//			System.out.println("inside if");
		
		// Assignment operator --> = += -= *= /= 
//		int a = 100;
//		int x,y,z;
//		x = y = z = 10;
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		
//		int b = 20;
//		b += 40; //20 + 40
//		System.out.println(b);
		
		// Ternary Operator --> ?
//		testExpression ? value1 : value2
		int x = 20,y = 30;
		String res = (x>y) ? x+" is greater" : y+" is greater";
		System.out.println(res);
		
		
	
	}
}









