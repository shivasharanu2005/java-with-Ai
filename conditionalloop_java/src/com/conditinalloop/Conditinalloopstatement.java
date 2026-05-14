package com.conditinalloop;

import java.util.Scanner;

public class Conditinalloopstatement {
	public static void main(String[] args) {
		/*
		 * if,if else,else if,switch
		 * Green-->go
		 * Red --->stop
		 * yellow--->ready
		 * --------->inValid
		 * 
		  */
		String str1="green";//String literal
		
		//String str2="green";
		String str2 = new String("green");
		
		System.out.println("1:"+(str1==str2)); //false
		System.out.println("2:"+str1.equals(str2));//true
		System.out.println("3:"+str1.compareTo(str2));//0
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		String userinput=sc.next(); //green or Green or GReen
		
		if(userinput.equalsIgnoreCase("green")){
			System.out.println("Go");
		}
		else if(userinput.equalsIgnoreCase("Red")){
			System.out.println("stop");
		}
		
		else if (userinput.equalsIgnoreCase("yellow")){
			System.out.println("Ready");
			
		} else {
			System.out.println("invalid");
		}

	}

}
