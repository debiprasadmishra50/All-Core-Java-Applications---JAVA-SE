package JDK9Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamingAPI 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(10,20,3,70,52,25,null);
//		List<Integer> multipleOfFive = list.stream().filter((x)-> x%5 == 0).collect(Collectors.toList());
//		System.out.println(multipleOfFive);
		
		List<Integer> takewhile = list.stream().takeWhile((x)-> x%5==0).collect(Collectors.toList());
		System.out.println(takewhile); //takeWhile() will take the element till it matches the condition and stop checking there where the predicate returns false and return upto that of the list
		
		List<Integer> dropwhile = list.stream().dropWhile((x)-> x%5==0).collect(Collectors.toList());
		System.out.println(dropwhile); //dropWhile() skip the elements that matches the condition and will stop checking there where the predicate returns true and return rest of the list
		
		List<Integer> ofnullable = list.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList()); //Doesnt take null values and returns the list
		System.out.println(ofnullable);
	}
}
