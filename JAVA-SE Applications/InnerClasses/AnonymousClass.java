package InnerClasses;

class AnonymousClass
{
	public static void main(String[] args) 
	{
		AnonymousClass t1 = new AnonymousClass ();

		AnonymousClass t2 = new AnonymousClass()
		{
		};	//javac will create the anonymous class Test$1
		AnonymousClass t3 = new AnonymousClass()
		{
		};	//javac will create the anonymous class Test$2
	}
}
