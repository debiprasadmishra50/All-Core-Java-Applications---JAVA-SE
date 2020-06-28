
public class Grading_Application 
{
	public static void main(String[] args) 
	{
		int math = 40,phy = 50,che = 90;
		if(math<35 || phy<35 || che<35)
			System.out.println("You are Fail");
		else
		{
			int avg = (math+phy+che)/3;
			if(avg <= 59)
				System.out.println("C grade");
			else if(avg > 59 && avg <= 69)
				System.out.println("B Grade");
			else
				System.out.println("A Grade");
		}
		
		
	}
}
