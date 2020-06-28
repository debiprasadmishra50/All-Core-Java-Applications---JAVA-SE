package assertion;

public class Assertion 
{
	public static void main(String[] args) 
	{
		int withdrawal = 100;
		int current = 60; //Will show Withdrawal is More Than Current
//		int current = 600; //Will Pass and won't show anything as it is correct
//		assert(withdrawal < current);
		assert(withdrawal < current) : "Withdrawal is More Than Current";
		
	}
}
