package com.polymorphism;

class Calculation{
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(double a,double b) {
		return a+b;
	}
}
//run time polymorphism
public class MethodOverloading {
	public static void main(String[] args) {
		Calculation c=new Calculation();
		int res=c.add(10, 20);
		System.out.println("res:"+res);
		
		int res1=c.add(20,20,20);
		System.out.println("res1:"+res1);
		
		double res3=c.add(20.1, 203.2);
		System.out.println("res3:"+res3);
		
		
	}

}
