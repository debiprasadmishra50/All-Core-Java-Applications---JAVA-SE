
public class BreakWithLabel 
{
	public static void main(String[] args) 
	{
		int x = 20;
		l1:
		{
			System.out.println("L1 Block Begins");
			if(x == 20)
				break l1;
			System.out.println("L1 Block Ends");
		}
		
		System.out.println("Outside L1 Block");
	}
}
