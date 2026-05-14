package com.arrayinjva;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class userinputarray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" enter size of array:");
		int size = sc.nextInt();
		int arr[]  = new int[size];
		
		
		for(int i=0;i<size;i++) {
			System.out.println("enter "+(i+1)+"element:");
			arr[i]=sc.nextInt();
		}
		
		
		//int max=arr[0];
		//for(int ele:arr) {
			//if(ele>max) {
				//max=ele;
			//}
		//}
		//System.out.println("max:"+max);
		
		OptionalInt max =Arrays.stream(arr).max();
		System.out.println(max.getAsInt());
		
		

	
		
	}
}