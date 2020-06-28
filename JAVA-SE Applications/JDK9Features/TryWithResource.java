package JDK9Features;

public class TryWithResource implements AutoCloseable 
{
	public TryWithResource() {
		System.out.println("Creating the resource");
	}
	
	public void doSomething()
	{
		System.out.println("Doing Something");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Closing the resource");
	}
	
}
