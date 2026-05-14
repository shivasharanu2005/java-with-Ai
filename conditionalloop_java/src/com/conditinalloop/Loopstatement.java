package com.conditinalloop;

import java.util.Scanner;

public class Loopstatement {
	public static void main(String[] args) {
		// using for loop from 1 to user number
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = sc.nextInt();
        
        int i=1;
       while(i<=num) {
            System.out.println(i + " ");
            i++;
        }

	}
}