package com.encapsulation;

class Student1 {

    // private variables (encapsulation)
    private String name;
    private int age;
    private String usn;

    // toString()
    @Override
    public String toString() {
        return "Student[name=" + name + ", age=" + age + ", usn=" + usn + "]";
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUsn() {
        return usn;
    }
    	//setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }
}

public class Goodstudent {

    public static void main(String[] args) {

        Student1 st1 = new Student1();

        st1.setName("shivasharanu");
        st1.setAge(20);
        st1.setUsn("1CE24AI077");

        System.out.println(st1.getName());

        System.out.println(st1);
    }
}