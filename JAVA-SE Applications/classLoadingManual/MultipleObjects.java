package classLoadingManual;

public class MultipleObjects 
{
	public static void main(String[] args) 
	{ //Proof of class is loaded into JVM only once
		Users u1 = new Users();
		Class c1 = u1.getClass();
		
		Users u2 = new Users();
		Class c2 = u1.getClass();
		
		System.out.println(c1.hashCode()); //1392838282
		System.out.println(c2.hashCode()); //1392838282
		System.out.println(c1==c2); //true
		
		System.out.println(c1.getClassLoader()); //jdk.internal.loader.ClassLoaders$AppClassLoader@c387f44
		System.out.println(String.class.getClassLoader()); //String or inbuilt classes gets loaded by JRE i.e. by rt.jar which is known as bootstrap class loading, that's why null is returned
	}
}
