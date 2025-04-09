package com.paritech.numberprocessing;

import java.util.Scanner;

public class PrimeOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		=======================================
		
//		18.Prime Number Check – Determine if a number is prime.
		
		System.out.println("Enter a number to check Prime : ");
		int number = sc.nextInt();
		boolean check = false;
		
		if(number <= 1) {
			check = true;
		}
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				check = true;
				break;
			}
		}
		
		System.out.println(check ? (number + " is Not Prime") : (number + " is Prime"));
//		==========================================
		
//		19.Print Prime Numbers in a Range – Print all prime numbers between m and n.
		System.out.println("Enter lower limit : ");
		int lower = sc.nextInt();
		System.out.println("Enter upper limit : ");
		int upper = sc.nextInt();
		
		System.out.println("prime number b/w " + lower + " and " + upper + " : ");
		
//		for (int i = (lower < upper ? lower : upper); i <= (lower < upper ? upper : lower); i++) {
//		above can be used if not sure upper or lower which will come first
		
		
		for (int i = lower; i <= upper; i++) {
			 if(i < 2) continue;
			 
			 boolean flag = false;
			 
			 for(int j = 2; j < i; j++) {
				 if(i % j == 0) {
					 flag = true;
					 break;
				 }
			 }
			 
			 if(!flag) {
				 System.out.println(i);
			 }
		}
		
		
		sc.close();
		
	}

}
