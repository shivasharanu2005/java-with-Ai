package com.encapsulation;

class Student {
	public String name;
	public int age;
	public String usn;

	@Override  //dev 
    public String toString() {
        return "Student[name=" + name + ", age=" + age + ", usn=" + usn + "]";
		}
}

public class Badstudent {
	public static void main(String[] args) {
		//object
		Student st1=new Student();
		st1.name="";
		st1.age=20;//valid or not
		st1.usn="1e077";
		System.out.println(st1);//address
		
	}

}
