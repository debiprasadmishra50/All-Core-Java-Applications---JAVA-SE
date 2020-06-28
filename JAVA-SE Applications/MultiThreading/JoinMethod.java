package MultiThreading;

import java.util.Scanner;

public class JoinMethod extends Thread
{
	static int a,sum=0;
	public static void main(String[] args) 
	{
		long start = System.currentTimeMillis();
		System.out.println("Sum of first N nos");
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		JoinMethod.a = sc.nextInt();
		
		JoinMethod j = new JoinMethod();
		j.start();
		try {
			j.join();
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Sum of first "+a+" numbers is : "+JoinMethod.sum);
		long end = System.currentTimeMillis();
		
		System.out.println("Total time taken = "+(end-start)/1000+" Seconds");
	}
	
	public void run()
	{
		for (int i = 1; i <= a; i++) 
		{
			JoinMethod.sum = i+JoinMethod.sum;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
