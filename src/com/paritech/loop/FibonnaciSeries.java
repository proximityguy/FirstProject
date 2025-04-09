package com.paritech.loop;

import java.util.Scanner;

public class FibonnaciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		1.	generate 'n' numbers of fibonacci numbers
		System.out.println("Enter no. of fibonacci numbers you want to generate : ");
		int series = sc.nextInt();
		
		int prev = -1;
		int next = 1;
		
		System.out.println("your fibonacci series is : ");

		for (int i = 1; i <= series; i++) {
			int fibNum = prev + next;
			System.out.println("fibNum - " + i + " : " + fibNum);
			prev = next;
			next = fibNum;
		}
//		
		System.out.println("=============================");
//		2. generate fibonacci numbers upto a given number
		
		System.out.println("Enter value upto which you want to generate fibonacci numbers : ");
		int limit = sc.nextInt();
		
		prev = -1;
		next = 1;
		
		System.out.println("your fibonacci series < " + limit);
		int fibNum = prev + next;

//		using while loop
		while (fibNum <= limit) {
			System.out.println(fibNum);
			prev = next;
			next = fibNum;
			fibNum = prev + next;
		}
		
//		using do-while loop
		do {
			System.out.println(fibNum);
			prev = next;
			next = fibNum;
			fibNum = prev + next;
		} while (fibNum <= limit);
		
		System.out.println("===========================");
//		3. check if a given number belongs to fibonacci series or Not
		
		System.out.println("Enter the number to check if it is fibonacci or Not");
		int num = sc.nextInt();

		
		prev = -1;
		next = 1;
		
		fibNum = prev + next;
		boolean flag = false;
		
		while(fibNum <= num ) {
			if (fibNum == num) {
				flag = true;
				break;
			}
			
			prev = next;
			next = fibNum;
			fibNum = prev + next;
		}
		
		if(flag == false) {
			System.out.println(num + " is NOT a Fibonacci number");
		} else {
			System.out.println(num +" is a Fibonacci Number");
		}
				
		
		sc.close();
	}

}
