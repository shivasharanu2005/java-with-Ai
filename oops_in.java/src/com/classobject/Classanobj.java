package com.classobject;

class Student {
	// instance variable belongg to obj
	String name;
	int roll;
	boolean ismale;
	

//behavior
	public void isWalking() {
		System.out.println("shahid is walking:");
	}
	public void isSleeping() {
		System.out.println("Student is Sleeping:");
	}
	
}

public class Classanobj {
	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name="shahid";
		st1.roll=073;
		st1.ismale=true;
		System.out.println(st1.name);
		System.out.println(st1.roll);
		System.out.println(st1.ismale);
		st1.isWalking();
		st1.isSleeping();
		
		Student st2 = new Student();
		st1.name="sharanu";
		st1.roll=077;
		st1.ismale=true;
		System.out.println(st1.name);
		System.out.println(st1.roll);
		System.out.println(st1.ismale);
		st1.isWalking();
		st2.isSleeping();
		
		
		

	}

}
