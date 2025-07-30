package oopInheritance.sec04;

public class Employee {
	private String empNo;
	private String name;
	private String part;
	
	//매개변수가 
	public Employee(String empNo, String name, String part) {
		this.empNo = empNo;
		this.name = name;
		this.part = part;
	}
	
	@Override
	public String toString() {
		return empNo + "\t | " + name + "\t | " + part;  
	}
}
