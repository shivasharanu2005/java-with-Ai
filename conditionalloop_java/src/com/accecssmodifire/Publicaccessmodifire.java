package com.accecssmodifire;

class Person{
	public String name;
	private int age;
	int salary;
	protected void display() {
		System.out.println("this is person display");
	}
	
}

public class Publicaccessmodifire {
	public static void main(String[] args) {
		Person p=new Person();
		p.name="  sharanu";
		System.out.println("Name"+p.name);
		
		//p.age//we can't access out side the class
	}

}
