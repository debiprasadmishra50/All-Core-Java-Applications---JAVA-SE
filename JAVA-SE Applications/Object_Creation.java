
public class Object_Creation 
{
	int x;
	Object_Creation()
	{
		
	}
	public static void main(String[] args) 
	{
		Object_Creation or = new Object_Creation(); //or is the reference to the object that holds an hashcode i.e. the memory address thet the object has been allocated
		// size of the object is 16bytes from which 12bytes are used and 4 bytes are left for use
		System.out.println(or); //ObjectReference@5305068a //hashcode
		System.out.println(or.x); //0
	}
}
