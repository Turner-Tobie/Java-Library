package _14_Constructor_Employee;

public class Manager extends Employee {
	
	public String department;

	public Manager(String wholeName, double salary, int startYear, int birthYear, String department) {
		super(wholeName, salary, startYear, birthYear);
		this.department=department;
		// TODO Auto-generated constructor stub
	}

}
