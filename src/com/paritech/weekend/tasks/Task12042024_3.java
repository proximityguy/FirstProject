/*
Task 3:
Given an Employee base class, how would you override a calculateSalary() method in different subclasses such as FullTimeEmployee, PartTimeEmployee, and Intern to compute salaries differently using polymorphism?
 */

package com.paritech.weekend.tasks;
class Employees
{
	int baseSalary = 18500;
	double calculateSalary() {
		return baseSalary;
	}
}

class FullTimeEmployee extends Employees
{
	@Override
	double calculateSalary() {
		return (baseSalary * 2.5);
	}
}

class PartTimeEmployee extends Employees
{
	@Override
	double calculateSalary() {
		return (baseSalary * 1.7);
	}
}

class Intern extends Employees
{
	@Override
	double calculateSalary() {
		return (baseSalary * 1.1);
	}
}
   
public class Task12042024_3 {

	public static void main(String[] args) {
		
		Employees emp = new Employees();
		FullTimeEmployee fullTimeEmp = new FullTimeEmployee();
		PartTimeEmployee partTimeEmp = new PartTimeEmployee();
		Intern internEmp = new Intern();
		
		System.out.println("base salary : " + emp.calculateSalary());
		System.out.println("Full Time Employee Salary : " + fullTimeEmp.calculateSalary());
		System.out.println("Part Time Employee Salary : " + partTimeEmp.calculateSalary());
		System.out.println("Intern Salary : " + internEmp.calculateSalary());
		
	}

}
