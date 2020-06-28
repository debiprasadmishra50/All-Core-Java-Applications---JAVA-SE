package stringHandling;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello"; // String literal //created in Strong Pool
	//String pool is a temporary memory location which can not store duplicate string value
		String s2 = new String("Hello"); //Constructor Overloading
	//memory allocation in heap memory with new address i.e. object creation
		char[] c = {'H','E','L','L','O'}; //Char array to String
		String s3 = new String(c);
		
		byte[] b = {65,66,67}; 	// Byte array to string
		String s4 = new String(b);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); // Hashcode is same but the reference in heap memory is different
		
	}
}
