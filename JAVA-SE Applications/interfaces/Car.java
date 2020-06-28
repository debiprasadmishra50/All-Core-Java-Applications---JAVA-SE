package interfaces;

public interface Car 
{
	void go(); //By default every method in an interface is public and abstract
	void stop();
	// variables inside a interface is public,static and final by default
	// constructor can not be invoked 
//	int a; //variables should be initialized at the time of declaration
	int a = 10;
	//static or non-static blocks can not be defined
	//can not define constructors
}
