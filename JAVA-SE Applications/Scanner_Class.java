import java.util.Scanner;

public class Scanner_Class 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two integers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res = a + b;
		System.out.println("Sum is "+res);
	}
}
