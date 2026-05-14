package com.typecasting;

public class Typecasting {
	public static void main(String[] args) {
		byte age = 20;
		int age1= age;
		
		//implicit
		System.out.println("age:"+age);
		System.out.println("age1:"+age1);
		
		//explicit
		int age2 = 21;
		byte age3= (byte)age2;//manually
		
		System.out.println("age2:"+age2);
		System.out.println("age3:"+age3);
		
		
	}

}
