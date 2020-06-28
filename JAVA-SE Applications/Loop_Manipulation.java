import java.util.Scanner;

public class Loop_Manipulation 
{
	static void byWhile(int num)
	{
		int a = 1;
		while (a <= num)
		{
			if(a%10 == 0)
			{
				a++;
				continue;
			}
			if(a > 100)
				break;
			System.out.print(a+"\t");
			a++;
		}
		System.out.println();
	}
	static void byDoWhile(int num)
	{
		int a = 1;
		do
		{
			if(a%10 == 0)
			{
				a++;
				continue;
			}
			if(a > 100)
				break;
			System.out.print(a+"\t");
			a++;
		}while(a <= num);
		System.out.println();
	}
	static void byFor(int num)
	{
		for (int a = 1; a <= num; a++) 
		{
			if(a%10 == 0)
				continue;
			if(a > 100)
				break;
			System.out.print(a+"\t");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("input a number");
		int a = sc.nextInt();
		Loop_Manipulation.byWhile(a);
		Loop_Manipulation.byDoWhile(a);
		Loop_Manipulation.byFor(a);
	}
}
