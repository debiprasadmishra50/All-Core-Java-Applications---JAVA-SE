package collectionFramework.Map;

public class User_WeakHashMap 
{
	@Override
	public String toString() {
		return "User";
	}
	
	@Override
	protected void finalize() throws Throwable {
	
		System.out.println("Finalize() called");
	}
}
