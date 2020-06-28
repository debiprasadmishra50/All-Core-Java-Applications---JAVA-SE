package Enums;

public class Test 
{
	public static void main(String[] args) 
	{
		PaymentType pt = PaymentType.CREDITCARD;
//		System.out.println(pt);
		
		PaymentType[] val = PaymentType.values(); //Returns the constant values in array of objects format
		for (PaymentType paymentType : val)
		{
			System.out.println(paymentType); 
			System.out.println("Index is "+paymentType.ordinal()); //Returns the index of the values
			
			System.out.println("Fee is : "+paymentType.getFee());
		}
			
		
	}
}
