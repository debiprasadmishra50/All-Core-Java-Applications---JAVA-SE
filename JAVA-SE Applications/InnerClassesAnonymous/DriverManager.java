package InnerClassesAnonymous;

public class DriverManager 
{
	static Connection getConnection()
	{
		Connection con = new Connection() //Anonymous class 
		{
			public void createStatement() //Over-ridden method
			{
				System.out.println("Anonymous Inner Class method");
			}
		};
		
		return con; //Return Anonymous Class Object
	}
}
