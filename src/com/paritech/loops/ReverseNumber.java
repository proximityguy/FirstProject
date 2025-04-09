package com.paritech.loops;

import java.util.Scanner;

public class ReverseNumber {

//		7. Reverse a Number – Reverse the digits of a number using a loop.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		==========================================
		
		System.out.println("Enter a number to reverse it : ");
		int number = sc.nextInt();
		int reverse = 0;
		
		while(number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number /= 10;
		}
		
		System.out.println("its reverse is : " + reverse);
		
		sc.close();
	}

}
