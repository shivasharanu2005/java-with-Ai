package com.classobject;

class Employee3 {

	private String name;
	private int salary;

	// parameterized constructor
	Employee3(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	// method
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

	// overriding toString()
	@Override
	public String toString() {
		return "Employee[name=" + name + ", salary=" + salary + "]";
	}
}

public class ClassObj {

	public static void main(String[] args) {

		Employee3 emp3 = new Employee3("Shahid", 111000);
		emp3.display();
		System.out.println(emp3);

		System.out.println();

		Employee3 emp31 = new Employee3("Shaaaahid", 11111000);
		emp31.display();
		System.out.println(emp31);
	}
}