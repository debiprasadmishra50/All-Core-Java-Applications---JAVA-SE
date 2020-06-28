package Arrays;

import java.util.Scanner;

public class FindElementInArray {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s[] = {"ABC" , "XYZ", "MNO", "PQR", "STV"};
		
		System.out.println("Enter the input");
		String input = sc.next();
		for (int i = 0; i < s.length; i++) 
		{
			if(input.equals(s[i]))
			{
				System.out.println("found");
				break;
			}
			else
			{
				if(i == s.length-1)
				System.out.println("Not Found");
				continue;
			}
			
		}
	}
}
