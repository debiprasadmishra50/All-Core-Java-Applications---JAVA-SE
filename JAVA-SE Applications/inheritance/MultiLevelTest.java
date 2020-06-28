package inheritance;

public class MultiLevelTest 
{
	public static void main(String[] args) 
	{
		Child c = new Child(); // Same memory allocation happens for both parent & Child classes
		c.f1();
		c.f2();
		Parent p = new Parent();
		p.f1();
		//p.f2(); //child class members can't be accessed by parent class object
		
		c.hashCode();
	}
}

//Parent Object inheritance.Child@279f2327
//Child Object inheritance.Child@279f2327
