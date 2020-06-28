package ObjectClassMethods;

public class Passenger 
{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	String f_name;
	String l_name;
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	
	@Override
	public String toString() {
	
		return "Passenger Info is First Name: "+this.f_name+" & Last Name: "+this.l_name;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		Passenger ps = (Passenger) obj;
		if(ps.getId() == this.id && ps.getF_name().equals(this.f_name) && ps.getL_name().equals(this.l_name))
		{
			return true;
		}
		else
			return false;
	}
}
