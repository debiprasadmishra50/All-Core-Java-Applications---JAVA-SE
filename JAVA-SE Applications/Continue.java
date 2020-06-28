// Print OddNumbers
public class Continue 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i < 10; i++) 
		{
			if(i%2 == 0)
				continue; //Skips rest of the code and jumps to next iteration
			System.out.println(i);
		}
	}
}
