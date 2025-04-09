package com.paritech.loops;

import java.util.Scanner;

public class ArmStrongNumber {

//		9. Armstrong Number – Check if a number is an Armstrong number (e.g., 153 = 1³ + 5³ + 3³).
//		ex - 153, 370, 371, 407, 1634, 8208, 9474, 54748 (54748 = 5⁵ + 4⁵ + 7⁵ + 4⁵ + 8⁵).
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		===========================================
		
		System.out.println("Enter a number to check ArmStrong Number : ");
		int number = sc.nextInt();
		int temp = number;
		int sum = 0;
		int digits = 0;
		
		while(number != 0) {
			digits++;	//	count digits to know how many times we need to multiply each digit
			number /= 10;
		}
		
		number = temp;	//	again re-assigning the original value to number variable
		
		while (number !=0) {
			int digit = number % 10;	//	extracting the last digit of the number
			int power = 1;
			
			for (int i = 1; i <= digits; i++) {
				power *= digit;		//	multiplying digits times and storing into power variable
			}
			
			sum += power;	//	after multiplying adding to get the number
			number /=10;	//	reducing the number by removing its last digit
		}
		
		System.out.println(temp == sum ? "armstrong" : "Not armstrong");
		
		sc.close();
	}

}
