package encapsulation;

public class Customer 
{
	private String first_name;
	private String last_name;
	private String creditcard;
	
	public String getFirst_name() 
	{
		return first_name;
	}
	public void setFirst_name(String first_name) 
	{
		this.first_name = first_name;
	}
	public String getLast_name() 
	{
		return last_name;
	}
	public void setLast_name(String last_name) 
	{
		this.last_name = last_name;
	}
	public String getCreditcard() 
	{
		return creditcard;
	}
	public void setCreditcard(String creditcard) 
	{
		this.creditcard = creditcard;
	}
	
}
