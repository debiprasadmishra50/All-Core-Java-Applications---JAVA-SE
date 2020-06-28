package classLoadingManual;

import java.lang.reflect.Method;

public class MethodsInUsers 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class c = Class.forName("classLoadingManual.Users");
		
		Method[] methods = c.getDeclaredMethods();
		
		for (Method method : methods) 
		{
			System.out.println(method.getName());
		}
		System.out.println(methods.length);
		
	}
}
