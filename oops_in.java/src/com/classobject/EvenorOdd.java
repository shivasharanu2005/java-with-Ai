package com.classobject;

public class EvenorOdd {
	
	static boolean isEven(int a) { //non static method
		return a%2==0;
	}
	
	 //boolean isEven(int a) { //non static method
			//return a%2==0;
	//}
	
	
	public static void main(String[] args) {
		boolean res=isEven(20);
		System.out.println(res);
		
	}

}
