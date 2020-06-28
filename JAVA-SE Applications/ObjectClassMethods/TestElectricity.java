package ObjectClassMethods;

public class TestElectricity 
{
	public static void main(String[] args) 
	{
		ElectricityBill eb = new ElectricityBill();
		eb.setMeterno(123);
		eb.setName("Debi");
		eb.setAddress("BBSR");
		
		ElectricityBill eb1 = new ElectricityBill();
		eb1.setMeterno(1223);
		eb1.setName("Ravi");
		eb1.setAddress("CTC");
		
		System.out.println(eb);
		System.out.println(eb.equals(eb1));
		System.out.println(eb.hashCode());
		System.out.println(eb1.hashCode());
	}
}
