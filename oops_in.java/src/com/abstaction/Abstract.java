package com.abstaction;

abstract class Shape {
	String color;

	public void displayColor() {
		System.out.println("Color: " + color);
	}

	// abstract methods
	public abstract double calculateArea();

	public abstract void draw();
}

// Circle class
class Circle extends Shape {
	double radius;

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	@Override
	public double calculateArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle with radius: " + radius);
	}
}

// Rectangle class
class Rectangle extends Shape {
	double length;
	double width;

	public Rectangle(double length, double width, String color) {
		this.length = length;
		this.width = width;
		this.color = color;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}

	@Override
	public void draw() {
		System.out.println(
				"Drawing Rectangle with length: " + length + " and width: " + width);
	}
}

// Main class
public class Abstract {
	public static void main(String[] args) {

		Circle c = new Circle(5, "Red");
		System.out.println("Circle Area: " + c.calculateArea());
		c.draw();

		

		Rectangle r = new Rectangle(4, 6, "Blue");
		System.out.println("Rectangle Area: " + r.calculateArea());
		r.draw();
	}
}