package collectionFramework.Random;

import java.util.Random;

public class RandomDemo 
{
	public static void main(String[] args) 
	{
		Random obj = new Random();
		
		int x = obj.nextInt(); //Generate a random number
		System.out.println("x : "+x);
		int y = obj.nextInt(100); //Generate a random number b/w 100
		System.out.println("y : "+y);
	}
	
	
}
