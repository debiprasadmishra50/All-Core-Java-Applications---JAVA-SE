package stringTokenizer;

import java.util.StringTokenizer;
public class StringTokenizerDemo 
{

	public static void main(String[] args) 
	{
		String s = "You are , the creator , of your destiny";
		String[] s1 =  s.split(" ");
		for(String res : s1)
		{
			System.out.println(res);
		}
		
		System.out.println("-------------------------");
		
//		StringTokenizer st = new StringTokenizer(s); //Divides by space
//		StringTokenizer st = new StringTokenizer(s,","); //By default it is space //, is a delimeter
		//divides by ,
		StringTokenizer st = new StringTokenizer(s,",",true); //true considers , as tokens(Strings) also & false won't
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
	
	
	

