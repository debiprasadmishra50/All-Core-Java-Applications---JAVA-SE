package final_keyword;

public final class Final 
{
	/*
	 * final class can not be inherited
	 * final variable can be changed and has to assigned value at the time of initialization or inside a constructor
	 * final methods can not be over-ridden
	 * final object reference can not be changed i.e. multiple object can not be created with same reference
	 * Final can be static to avoid memory wastage - static for to create one instance for entire appliation
	 */
	
	final static float pi = 3.14f;
//	Final()
//	{
//		pi = 3.14f;
//	}
	public final void display()
	{
		System.out.println(Final.pi);
	}
	public static void main(String[] args) 
	{
		final Final f = new Final();
//		f = new Final();
//		f.pi = 5.6f;
		System.out.println(Final.pi);
	}
}
