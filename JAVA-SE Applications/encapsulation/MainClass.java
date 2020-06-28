package encapsulation;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Patient p = new Patient();
		p.setId(100);
		p.setName("Debi");
		p.setSsn("Fever");
		
		System.out.println("Id : "+p.getId());
		System.out.println("Name : "+p.getName());
		System.out.println("SSN : "+p.getSsn());
	}
}
