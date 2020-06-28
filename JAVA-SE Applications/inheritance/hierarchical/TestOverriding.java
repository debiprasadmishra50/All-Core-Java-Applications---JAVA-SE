package inheritance.hierarchical;

public class TestOverriding 
{
	public static void main(String[] args) 
	{
		Car c = new Car();
		Bike b = new Bike();
		Bus bus = new Bus();
		Vehicle vh = new Vehicle();
		
		System.out.println(c.fuel());
		System.out.println(b.fuel());
		System.out.println(bus.fuel());
		System.out.println(vh.fuel());
	}
}
//diesel
//petrol
//CNG
//petrol

