package polymorphism;

public class Test 
{
	public static void main(String[] args) 
	{
		//Up-casting - child class object in reference(treated as) to parent class object
		MacBook m1 = new MacBookPRO(); //child class object with parent class reference
		MacBook m2 = new MacBookAir();
		m1.start(); //Search the method in child, if not present search in parent
		m1.shutDown();
//		m1.show();  //If not present in parent, it can not find it, can be shown by Down-Casting
		m2.start();
		m2.shutDown();
		
		System.out.println("---------------------");
		
		Apple_Laptop al = new MacBookPRO();
		Apple_Laptop al2 = new MacBookAir();
		al.start();
		al.shutDown();
		al2.start();
		al2.shutDown();
		
		System.out.println("--------------------------");
		
		//Down Casting
		MacBookPRO m3 = (MacBookPRO) m1; //
		MacBookAir m4 = (MacBookAir) m2;
 		m3.show();
		m4.show();
	}
}
