package com.conditinalloop;

import java.util.Scanner;

public class Loopstatement3 {
	public static void main(String[] args) {
		//loop untill the user neter +ve value
		
		Scanner sc = new Scanner(System.in);
		int value=0;
		do {
			System.out.println("Enter number:");
	        value = sc.nextInt(); //-45;
	        }while(value<=0); //-45<=0--true;
		
		System.out.println("your entered value:"+value);
	    
		}

}

