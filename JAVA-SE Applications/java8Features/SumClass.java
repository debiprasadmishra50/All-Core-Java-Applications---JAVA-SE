package java8Features;

public class SumClass 
{
	public static void main(String[] args) 
	{
		SumByLambda s = (x,y)->System.out.println("Sum is : "+(x+y));
		s.add(10, 20);
		
		
	}
}
