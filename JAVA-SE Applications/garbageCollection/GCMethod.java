package garbageCollection;

public class GCMethod 
{
	int objid;
	GCMethod(int objid) 
	{
		this.objid=objid;
		System.out.println("Created "+this.objid);
	}
	public static void main(String[] args) 
	{
		new GCMethod(1);
		new GCMethod(2);
//		for(int i = 1; i <= 500000 ; i++)
		for(int i = 1; i <= 100 ; i++)
		{
			//new GCMethod(i);
			System.gc();
		}
	}
	protected void finalize() // Overridden method of Object Class 
	//protected void finalize() throws java.lang.Throwable;
	//Used to clean up the resources
	{
		System.out.println("Finalized "+objid);
	}
}
