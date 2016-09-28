package _14_Constructor_Employee;

public class Employee {
	
	
	
	//Properties
	
	public String wholeName;
	double salary;
	int startYear;
	int birthYear;
	
	//Constructor
	//A constructor is a method that has the same name as the Class itself - it builds
	//our instances or objects of that class type
	
	public Employee(String wholeName, double salary, int startYear, int birthYear){
		this.wholeName = wholeName;
		this.salary = salary;
		this.startYear = startYear;
		this.birthYear = birthYear;
	}
	
	

}
