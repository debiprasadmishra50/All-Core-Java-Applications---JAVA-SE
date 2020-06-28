package exception_Handling;

public class NullPointer 
{
	static ArrayIndexOOB a;
	public static void main(String[] args) 
	{
		 try
		 {
			 NullPointer.a.method1(); //NullPointerException
		 }catch (NullPointerException e) 
		 {
			 System.out.println("Please a create an object of ArrayIndexOOB Class");
		 }
		 
	}
}
