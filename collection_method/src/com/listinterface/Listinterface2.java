package com.listinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listinterface2 {
	public static void main(String[] args) {
		List<Integer>arr1=new ArrayList<Integer>();
		arr1.add(20);
		arr1.add(76);
		arr1.add(80);
		arr1.add(90);
		
		
		int ele=arr1.get(3);
		
		System.out.println(arr1);
		System.out.println(ele);
		
		arr1.forEach((Value)->System.out.println(Value));
		System.out.println(Collections.min(arr1));
		
		
		
		
		
	}

}
