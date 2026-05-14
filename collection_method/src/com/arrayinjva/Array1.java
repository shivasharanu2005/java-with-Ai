package com.arrayinjva;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		int arr[]=new int[4];
		arr[1]=130;
		arr[2]=430;
		arr[3]=230;
		
		System.out.println(arr[3]);
		System.out.println(Arrays.toString(arr));
		
		//foe --each
		for(int ele: arr) {
			System.out.println(ele);
		}
	}

}
