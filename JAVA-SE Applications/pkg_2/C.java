package pkg_2;

import pkg1.*;

public class C 
{
	public static void main(String[] args) 
	{
		A.a1(); // To access use import
		// Instead of import you can use fully qualified name
		pkg1.A.a1();
	
	}
}
