package exception_Handling;
// Divison by 0 causes ArithmeticException
public class Divison 
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two number");
		a = sc.nextInt();
		b = sc.nextInt();
		
		try{
			c = a/b; //ArithmeticException
			System.out.println("Result : "+c);
		}catch (ArithmeticException e) 
		{
			System.out.println("Divison by zero is not possible");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
		System.out.println("More Code can go here");
	}
}
