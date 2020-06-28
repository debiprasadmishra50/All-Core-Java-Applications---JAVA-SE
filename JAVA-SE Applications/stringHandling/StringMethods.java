package stringHandling;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String s = "Hello World";
		
		System.out.println("Length of the string is "+s.length()); //5
		System.out.println(s.indexOf('o'));//4 //index statrts from 0
		System.out.println(s.charAt(0));//H
		System.out.println("Substring with beginning index 2: "+s.substring(2));//llo //from index to last
		System.out.println("substring with begin and end index: "+s.substring(0, 3)); //Hel
		
		String[] res = s.split(" ");
		for (String result : res) 
		{
			System.out.println(result);
		}
		
		System.out.println(s.replace('l', 'k')); //Hekko Workd
		System.out.println(s.toUpperCase()); //HELLO WORLD
		System.out.println(s.toLowerCase()); //hello world
		
		
		
	}
}
