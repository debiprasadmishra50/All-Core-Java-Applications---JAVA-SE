package abstraction;

public abstract class BMW //abstract with final/static is illegal modifiers
{
	void commFunc()
	{
		System.out.println("Inside BMW CommFunc() method");
	}
	abstract void acclerate();
//	public static void main(String[] args)	// can stay but no need 
//	{
//		System.out.println("Inside main method");
//	}
}
