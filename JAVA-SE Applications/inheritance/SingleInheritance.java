package inheritance;
// Object class is the parent class of the classes in Java
public class SingleInheritance 
{
	void m1()
	{
		System.out.println("Inside m1");
	}
	public static void main(String[] args) 
	{
		SingleInheritance s = new SingleInheritance();
		s.m1();
		s.hashCode(); //present in Object class
		s.getClass(); //present in Object class
		
	}
}
