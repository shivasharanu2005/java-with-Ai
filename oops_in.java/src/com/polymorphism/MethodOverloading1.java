package com.polymorphism;

//  class
class Shape {
	public void draw() {
		System.out.println("Drawing a shape");
	}
}

//  class 1
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
}

//  class 2
class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}
//run time polymorphism
public class MethodOverloading1 {
	public static void main(String[] args) {

		Shape s1 = new Circle();//upcastig
		s1.draw();

		Shape s2 = new Rectangle();//upcastig
		s2.draw();
	}
}