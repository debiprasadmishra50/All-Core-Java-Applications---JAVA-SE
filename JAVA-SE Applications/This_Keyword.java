
public class This_Keyword 
{
	int x;
	This_Keyword()
	{
		System.out.println(this); // this only can be used in non-static context
		System.out.println(this.x);
	}
	public static void main(String[] args) 
	{
		new This_Keyword(); //This_Keyword@5305068a
		new This_Keyword(); //This_Keyword@1f32e575
	}
}

/*
 * This_Keyword@5305068a
0
This_Keyword@1f32e575
0

*/
