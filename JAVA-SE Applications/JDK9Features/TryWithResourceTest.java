package JDK9Features;

public class TryWithResourceTest 
{
	public static void main(String[] args) 
	{
		TryWithResource t = new TryWithResource();
		
		try(t){
			t.doSomething();
		}catch (Exception e) 
		{
		}
	}
}
