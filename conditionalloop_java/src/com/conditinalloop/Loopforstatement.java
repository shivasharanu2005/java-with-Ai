package com.conditinalloop;

import java.util.Scanner;

public class Loopforstatement {
	public static void main(String[] args) {
		//fizzz

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        
        for(int i=1;i<=num;i++) {
        	if(i%3==0) {
        		System.out.println("fizz");
        	}else if(i%5==0) {
        		System.out.println("buzz");
        	}else {
        		System.out.println(i+" ");
        	}
        }
	}

}
