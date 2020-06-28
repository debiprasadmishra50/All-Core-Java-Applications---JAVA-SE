package ObjectClassMethods;

public class Test 
{
	public static void main(String[] args) 
	{
		Passenger ps = new Passenger();
		ps.setF_name("Debi");
		ps.setL_name("Mishra");
		System.out.println(ps); //ObjectClassMethods.Passenger@1f32e575
		//after over-riding toString() in Passenger class we see the output instead of hashcode
		
		//System.out.println(ps.hashCode()); //523429237
		ps.setId(1234);
		System.out.println(ps.hashCode()); // After override it returns id value i.e. 1234
		
		Passenger ps1 = new Passenger();
		ps1.setF_name("Debi");
		ps1.setL_name("Mishra");
		ps1.setId(1234);
		System.out.println(ps.equals(ps1)); //false //now it checks the contents and returns true as both contents are equal
		
	}
}
