package JAVA11Features;

import java.util.Optional;

public class OptionalUpdate 
{
	public static void main(String[] args) 
	{
		Optional<String> str = Optional.empty(); //Create a empty optional string
//		if(str.isPresent()) {
//		}else { }
		//To replace this
		System.out.println(str.isEmpty()); //true
		Optional<String> str1 = Optional.of("test");
		System.out.println(str1.isEmpty()); //false
	}
}
