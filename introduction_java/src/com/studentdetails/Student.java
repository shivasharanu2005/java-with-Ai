package com.studentdetails;

import java.util.Scanner;

public class Student {

    
    String name;
    int marks;
    String usn;
    String section;
    String department;

    // details
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Student Name : " + name);
        System.out.println("Student Marks : " + marks);
        System.out.println("Student USN : " + usn);
        System.out.println("Student Section : " + section);
        System.out.println("Student Department : " + department);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        Student st1 = new Student();

        System.out.print("Enter Student Name: ");
        st1.name = sc.nextLine();

        System.out.print("Enter Student Marks: ");
        st1.marks = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Student USN: ");
        st1.usn = sc.nextLine();

        System.out.print("Enter Student Section: ");
        st1.section = sc.nextLine();

        System.out.print("Enter Student Department: ");
        st1.department = sc.nextLine();

        // Display details
        st1.display();

        sc.close();
    }
}