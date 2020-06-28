
public class Loops 
{
	public static void main(String[] args) 
	{
		int i = 1; //1.Initialization
		while (i <= 10) //2. Condition Check
		{
			System.out.print(i+"\t"); //3. Logic execution
			i++;		// 4. Increment/Decrement
		}
		System.out.println();
		
		int k = 1;
		do // Gets executed atleast once
		{
			System.out.print(k+"\t");
			k++;
		}while(k <= 10);
		System.out.println();
		
		for (int j = 1; j <= 10; j++) 
		{
			System.out.print(j+"\t");
		}
	}
}
