package Serialization;

import java.io.Serializable;

public class Employee implements Serializable 
{
	int id;
	String name;
	double salary;
	transient int ssn; //we don't want it to be shared so it will not be printed in the file
	
	public Employee(int id,String name, double salary,int ssn) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
	}
}
