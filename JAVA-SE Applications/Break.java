
public class Break 
{ // Pushes the control out of a control statement
	public static void main(String[] args) 
	{
		for (int i = 10; i > 0; i--) 
		{
			if(i == 5)
				break;
			System.out.print(i+"\t");
		}
		
	}
}
