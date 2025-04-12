/*
Task 2:
How can you use polymorphism to create a program where an Animal class has a method makeSound() and subclasses like Dog, Cat, and Cow provide different implementations of that method?
*/

package com.paritech.weekend.tasks;
class Animals
{
	void makeSound() {
		System.out.println("animals make sound..!");
	}
}

class Dog extends Animals
{
	@Override
	void makeSound() {
		System.out.println("dog barks");
	}
}

class Cat extends Animals
{
	@Override
	void makeSound() {
		System.out.println("cat mews");
	}
}

class Cow extends Animals
{
	@Override
	void makeSound() {
		System.out.println("cow moos");
	}
}

public class Task12042024_2 {
	public static void main(String[] args) {
		Animals animal = new Animals();
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		animal.makeSound();
		dog.makeSound();
		cat.makeSound();
		cow.makeSound();
	}

}
