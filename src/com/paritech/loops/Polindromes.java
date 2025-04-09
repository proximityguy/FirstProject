package com.paritech.loops;

import java.util.Scanner;

public class Polindromes {
//		8. Palindrome Number – Check if a given number is a palindrome (same forward and backward).

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		========================================
		
//		1.	check if given number is palindrome or Not
		
		System.out.println("Enter a number to check palindrome number : ");
		int num = sc.nextInt();
		int temp = num;
		int reverse = 0;
		
		while (num != 0) {
			reverse = (reverse * 10) + (num % 10);
			num /= 10;
		}
		
		System.out.println(temp == reverse ? "palindrome" : "not Palindrome");
//		========================================
		
//		2.	print 'n' palindrome numbers of 'm' digits
//		3.	print palindrome numbers between given limits
	}

}
