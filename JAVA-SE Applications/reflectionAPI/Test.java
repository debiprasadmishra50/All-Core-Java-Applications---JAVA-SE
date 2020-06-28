package reflectionAPI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test 
{
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException 
	{
		Class<?> myclass = Class.forName(Calculator.class.getName());
		System.out.println(myclass.getName());
		
		Constructor<?>[] constructors = myclass.getConstructors();
		System.out.println(Arrays.toString(constructors));
		System.out.println(Arrays.toString(myclass.getMethods()));
		
		//Create Object and access particular constructors
		Constructor<?> constructor = myclass.getConstructor(null);
		System.out.println(constructor.newInstance(null));
		
		Constructor<?> constructor2 = myclass.getConstructor(double.class , double.class);
//		System.out.println(constructor2.newInstance(5.2 , 6.2)); //Print hashcodes of newly created objects, parameterized constructor invoked
		Object myObj = constructor2.newInstance(5.2 , 6.2);
		
		//access setter methods
		Method setNum1 = myclass.getMethod("setNum1", double.class);
		setNum1.invoke(myObj, 3.2);
		
		Method setNum2 = myclass.getMethod("setNum2", double.class);
		setNum2.invoke(myObj, 8.3);
		
		//Making private field accessible
		Field num1Field = myclass.getDeclaredField("num1");
		num1Field.setAccessible(true);
		num1Field.set(myObj, 80.23); //new value assigned to private
		
		//Access method getter methods
		Method method = myclass.getMethod("getNum1", null);
		System.out.println(method.invoke(myObj, null)); //returns 3.2
				
		Method method2 = myclass.getMethod("getNum2", null);
		System.out.println(method2.invoke(myObj, null)); //returns 8.3
		
		//Access sum() from calculator
		Method sumMethod = myclass.getMethod("sum", int.class, int.class);
		System.out.println(sumMethod.invoke(myObj, 2,3)); //return 2+3
	}
}
