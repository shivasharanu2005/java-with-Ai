package com.userinput;

import java.util.Scanner;

public class username {
	public static void main(String[] args) {
		//take student details name,Usn,department
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=sc.next();
		
		System.out.println("enter your usn");
		int usn=sc.nextInt();
		
		System.out.println("enter your section");
		char section=sc.next().charAt(0);
		
		System.out.println("enter your marks");
		float marks=sc.nextFloat();
		
		System.out.println("enter your departmnt");
		String department=sc.next();
		
		 System.out.println("\n--- Student Details ---");
	        System.out.println("Student Name : " + name);
	        System.out.println("Student Marks : " + marks);
	        System.out.println("Student USN : " + usn);
	        System.out.println("Student Section : " + section);
	        System.out.println("Student Department : " + department);
		
		
		
	}

}
