package com.numbers;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		System.out.println("Before Swapping:");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		System.out.println("After Swapping:");
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}

}
