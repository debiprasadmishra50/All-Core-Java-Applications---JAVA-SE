package stringHandling;

public class StringPool 
{
	public static void main(String[] args) 
	{
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		String s3 = "Hello";
		String s4 = "Hello";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println(s1==s3); //false , hashcode is same but internally they point to different memory locations and == checks hashcodes 
		System.out.println(s1.equals(s3)); //true //compare contents
		
		User u1 = new User(1, "abc");
		User u2 = new User(1, "abc");
		
		System.out.println(u1==u2); //false
		System.out.println(u1.equals(u2)); //false //here equals() is of Object class and doesn't check the contents
		
	}
}
