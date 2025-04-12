/*
Task 1:
Design a class hierarchy where Vehicle is the parent class and Car, Bike, and Truck are subclasses. How would you implement a method in Vehicle that each subclass overrides to display specific details?
*/

package com.paritech.weekend.tasks;
class Vehicles
{
	 void details() {
		 System.out.println("invented to transport from one place to another..!"
		 		+ "\n ---------------------------");
	 }
}

class Car extends Vehicles
{
	String name = "car";
	int wheels = 4;

	@Override
	void details() {
		System.out.println(name + " runs on " + wheels + " wheels having 2/4 doors..!");
	}
}

class Bike extends Vehicles
{
	String name = "bike";
	int wheels = 2;
	
	@Override
	void details() {
		System.out.println(name + " runs on " + wheels + " wheels having none or one basket.!");
	}
}

class Truck extends Vehicles
{
	String name = "truck";
	int wheels = 12;
	
	@Override
	void details() {
		System.out.println(name + " runs on " + wheels + " wheels and have very big space.!");
	}
}

public class Task12042024_1 {
	public static void main(String[] args) {
		
		Vehicles vehicle = new Vehicles();
		vehicle.details();

		Car car = new Car();
		car.details();
		
		Bike bike = new Bike();
		bike.details();
		
		Truck truck = new Truck();
		truck.details();

	}

}
