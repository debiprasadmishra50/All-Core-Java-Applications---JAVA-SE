package Super_MoreInheritances;

public class Child extends Parent
{
	int c,d;
	Child(int a, int b,int c,int d) 
	{
		super(a,b);
		this.c = c;
		this.d = d;
	}
	
	void display()
	{
		System.out.println("Parents a "+super.a);
		System.out.println("Parents b "+super.b);
		System.out.println("child c "+this.c);
		System.out.println("child d "+this.d);
	}
	
	void f1()
	{
		super.f1(); //refer to super class instances
		System.out.println(this);
		//System.out.println(super); //error
		System.out.println("Inside Child f1()");
	}
}
