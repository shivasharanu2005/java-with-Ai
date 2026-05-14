package com.classobject;

class Employee {
	// instance variable belongg to obj
	String name;
	int salary;
	//parameterized const.
	 Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	 public void display() {
		 System.out.println("name"+name);
		 System.out.println("salary:"+ this.salary);
	 }
	
}
	
public class ClassAndObject {
	public static void main(String[] args) {
		Employee emp1=new Employee("shahid" ,111000);
		emp1.display();
		Employee emp2=new Employee("shaaaahid" ,11111000);
		emp2.display();
		
	}

}
