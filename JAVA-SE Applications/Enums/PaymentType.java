package Enums;

public enum PaymentType 
{
	DEBITCARD(5),CREDITCARD(10),CASH(0);
	
	int fee;
	PaymentType(int fee)
	{
		this.fee = fee;
	}
	public int getFee()
	{
		return this.fee;
	}
}
