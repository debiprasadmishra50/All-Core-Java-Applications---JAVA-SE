package stringBuffer;

public class StringBufferDemo 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("Initial Capacity : "+sb.capacity()); //16 //initial Capacity
		sb.append("All the power is within you");
		sb.append("you can do anything and everything");
		
		System.out.println(sb);
		System.out.println("Current Capacity : "+sb.capacity());
		System.out.println("Char at : "+sb.charAt(10));
		
		StringBuffer sb1 = new StringBuffer("abcde");
		System.out.println(sb1.reverse());
		System.out.println(sb1.insert(3, "XYZ"));
		System.out.println(sb1.delete(3, 6));
		
		
	}
}
