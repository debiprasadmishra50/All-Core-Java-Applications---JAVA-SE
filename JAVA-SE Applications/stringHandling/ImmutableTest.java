package stringHandling;

public class ImmutableTest 
{
	public static void main(String[] args) 
	{
		User user = new User(10, "John"); //User is a mutuable class
		System.out.println(user); //stringHandling.User@1f32e575
		
		String s = new String("Debi");
		System.out.println(s); //Debi
		
		Integer i = new Integer(123);
		System.out.println(i); //123
	}
}
