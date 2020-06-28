package ObjectClassMethods;

public class ElectricityBill 
{
	int meterno;
	String name;
	String address;
	public int getMeterno() {
		return meterno;
	}
	public void setMeterno(int meterno) {
		this.meterno = meterno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
	
		return "BillInfo :- meterno: "+this.meterno+" Name: "+this.name+" Address: "+this.address;
	}
	
	@Override
	public boolean equals(Object obj) {
	ElectricityBill eb = (ElectricityBill) obj;
		if(eb.meterno == this.meterno)
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		return this.meterno;
	}
}
