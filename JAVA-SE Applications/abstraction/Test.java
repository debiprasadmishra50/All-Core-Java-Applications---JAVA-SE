package abstraction;

public class Test 
{
	public static void main(String[] args) 
	{
//		BMW b = new BMW();
		ThreeSeries ts = new ThreeSeries();
		ts.acclerate();
		ts.commFunc();
		FiveSeries fs = new FiveSeries();
		fs.acclerate();
		fs.commFunc();
	}
}
