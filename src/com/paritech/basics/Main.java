package com.paritech.basics;

import java.util.Scanner;

public class Main {

//	Basic Challenges
	
	public static void main(String[] args) {
		
//		1. Even or Odd – Check whether a given number is even or odd using if.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check whether it is Even or Odd : ");
		int num = sc.nextInt();
		System.out.println((num % 2 == 0) ? "even" : "odd");
//		=========================================================
		
//		2. Positive, Negative, or Zero – Determine if a number is positive, negative, or zero.
		
		System.out.println("Enter a number to check - positive, negative or zero");
		int integer = sc.nextInt();
		if(integer < 0) {
			System.out.println("Negative Number");
		} else if(integer > 0) {
			System.out.println("Positive Number");
		} else {
			System.out.println("Zero");
		}
//		==========================================================
		
//		3. Largest of Three Numbers – Find the largest among three given numbers.
		
		System.out.println("enter first number : ");
		int first = sc.nextInt();
		System.out.println("enter second number : ");
		int second = sc.nextInt();
		System.out.println("enter third number : ");
		int third = sc.nextInt();
		
		System.out.print("largest number : ");
		int result;
		
		if(first > second) {
			if(first > third) {
				result =  first;
			} else {
				result = third;
			}
		} else {
			if(second > third) {
				result = second;
			} else {
				result = third;
			}
		}
		
		System.out.println(result);
		
//		another way to find the 3rd largest number
		result = (first > second) ? (first > third) ? first : third	: (second > third) ? second : third;
		System.out.println("largest number : " + result);		
//		============================================================
		
//		4. Leap Year Check – Determine if a given year is a leap year.

		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("leap");
		} else if(year % 400 == 0) {
			System.out.println("leap");
		} else {
			System.out.println("non leap");
		}
//		=============================================================
		
//		5. Sum of Digits – Find the sum of digits of a given number using a loop.
		
		System.out.println("Enter a positive number : ");
		int number = sc.nextInt();
		int digitSum = 0;
		
		while (number != 0) {
			digitSum += number % 10;
			number = number / 10;
		}
		System.out.println("Sum of digits : " + digitSum);
		

		sc.close();
	}

}
