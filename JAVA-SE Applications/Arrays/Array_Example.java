package Arrays;

public class Array_Example 
{
	public static void main(String[] args) 
	{
//		int arr[5];
//		int arr[] = {10,20,30,40,50};
		int arr[] = new int[5];
		arr = new int[] {1,2,3,4,5};
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		for (int i : arr) 
		{
			System.out.print(i+"\t");
		}
	}
}
