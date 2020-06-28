package exception_Handling;

public class Test 
{
	public static void main(String[] args) throws CheckedUDException {
		//throw new UncheckedUDException("Exception Occured");
		throw new CheckedUDException("checked Exception occured");
	}
}
