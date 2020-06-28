
public class Check_Prime 
{
	static void checkPrime()
	{		
		for (int i = 1; i < 20; i++) 
		{
			int c = 0;
			for(int j=2;j <= i/2;j++)
			{
				if(i%j == 0)
					c++;;
			}
			if(c == 0)
				System.out.print(i+"\t");
		}
	}
	
	public static void main(String[] args) 
	{
		Check_Prime.checkPrime();
//		int x = 9,c=0;
//		for(int i = 2;i <= x/2;i++)
//		{
//			if(x%i == 0)
//				c++;
//		}
//		if(c==0)
//			System.out.println(x+" is prime");
	}

}
