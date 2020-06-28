
public class Switch_Case 
{
	public static void main(String[] args) 
	{
		int x = 2; //byte, short,char,int,enum,String can be supported
		switch(x)
		{
			case 1:
				System.out.println("Case 1");
				break;
			case 2:
				System.out.println("Case 2");
				break;
			default : // will be executed only if non of the cases are matched
				System.out.println("Default");
				
		}
	}
}
