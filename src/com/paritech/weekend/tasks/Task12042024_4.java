/*
Task 4:
How would you create an abstract class Shape with an abstract method calculateArea(), and implement it in subclasses like Circle, Rectangle, and Triangle to calculate their respective areas?
*/

package com.paritech.weekend.tasks;
abstract class Shape
{
	abstract double calculateArea();
}

class Circle extends Shape
{
	double radius = 21;
	
	@Override
	double calculateArea() {
		return (radius * radius * Math.PI);
	}
}

class Rectangle extends Shape
{
	double length  = 12;
	double breadth = 6;
	
	@Override
	double calculateArea() {
		return (length * breadth);
	}
	
}

class Triangle extends Shape
{
	double base = 16;
	double height = 3;
	
	@Override
	double calculateArea() {
		return (base * height * 0.5);
	}
	
}

public class Task12042024_4 {
	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		
		System.out.println("area of circle : " + circle.calculateArea());
		System.out.println("area of rectangle : " + rectangle.calculateArea());
		System.out.println("area of triangle : " + triangle.calculateArea());
		
	}

}
