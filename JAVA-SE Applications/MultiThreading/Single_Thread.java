package MultiThreading;

public class Single_Thread 
{
	
	void printNo()
	{
		for (int i = 1; i <= 200; i++) 
		{
			System.out.print(i+"\t");
		}
	}
	public static void main(String[] args) 
	{
		Single_Thread st = new Single_Thread();
		st.printNo();
		System.out.println();
		for (int j = 1; j <= 200; j++) 
		{
			System.out.print(j+"\t");
		}
	}
}
