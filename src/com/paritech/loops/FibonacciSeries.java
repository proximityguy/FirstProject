package com.paritech.loops;

import java.util.Scanner;

public class FibonacciSeries {
	
//		10.	Print Fibonacci Series – Print the Fibonacci sequence up to a given number

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		=====================================================
		
//		1.	generate 'n' numbers of fibonacci numbers

		System.out.println("Enter number of fibonacci no. you want : ");
		int n = sc.nextInt();
		
		int first = -1;
		int next = 1;
	
		for (int i = 0; i < n; i++) {
			int fibNum = first + next;	//	can be added inside the loop
			System.out.println("fibonacci " + (i + 1) + " : " + fibNum);
			first = next;
			next = fibNum;
			fibNum = first + next;
		}
//		=======================================================
		
//		2. generate fibonacci numbers up to a given number

		System.out.println("Enter a limit upto which you want fibonacci numbers : ");
		int limit = sc.nextInt();
		
		first = -1;
		next = 1;
		
		int fibNum = first + next;
		int count = 1;	//	for counting number of fibonacci numbers
		
		while(fibNum <= limit) {
			System.out.println("fibonacci " + count + " : " + fibNum);
			first = next;
			 next = fibNum;
			 fibNum = first + next;	
			 count++;
		}
//		=======================================================

//		3. check if a given number belongs to fibonacci series or Not

		System.out.println("Enter a number to check if it is a Fibonacci Number or Not");
		int num = sc.nextInt();
		boolean check = false;
		
		first = -1;
		next = 1;
		fibNum = first + next;
		
		while(fibNum <= num) {
			if(fibNum == num) {
				check = true;
				break;
			}
			first = next;
			next = fibNum;
			fibNum = first + next;
		}
				
		System.out.println(check ?  (num + " is a fibonacci number") : (num + " is NOT a fibonacci number"));
		
		
		
		sc.close();
	}

}
