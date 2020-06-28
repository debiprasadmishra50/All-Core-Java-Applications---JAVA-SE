package exception_Handling;

public class ArrayIndexOOB 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4};
		System.out.println("Elements of array are \n");
		try
		{
				for (int i = 0; i <= arr.length; i++) 
			{
				System.out.println(arr[i]);//ArrayIndexOutOfBoundsException
			}
		}catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Index is beyond array length");
		}
		
		System.out.println("After array output");
	}
	
	void method1()
	{
		System.out.println("method1() in ArrayIndexOOB");
	}
}
