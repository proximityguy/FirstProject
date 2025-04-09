package com.paritech.loops;

import java.util.Scanner;

public class Factorials {

//		6. Factorial of a Number – Compute the factorial of a number using a loop.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		======================================
		
		System.out.println("Enter a number to find its factorials : ");
		int number = sc.nextInt();
		int factorial = 1;
		
		System.out.println("Factorial : ");
		if(number == 0 || number == 1) {
			factorial = 1;
		}
		
		for (int i = 2; i <= number; i++) {
			factorial *= i;
		}
		
		System.out.println(factorial);
		
		sc.close();
	
	}

}
