package encapsulation;

public class Test 
{
	public static void main(String[] args) 
	{
		Customer c = new Customer();
		
		c.setFirst_name("Debi");
		c.setLast_name("Mishra");
		c.setCreditcard("12345");
		
		System.out.println("First name : "+c.getFirst_name());
		System.out.println("Last Name : "+c.getLast_name());
		System.out.println("Credit Card : "+c.getCreditcard());
	}
}
