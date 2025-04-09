package com.paritech.numberprocessing;

import java.util.Scanner;

public class OddEvenSeperateSum {

	public static void main(String[] args) {
//		17.Find the Sum of Even and Odd Numbers – Calculate the sum of even and odd numbers in a given range.
		Scanner sc = new Scanner(System.in);
//		========================================
		
		System.out.println("Enter the lower limit : ");
		int lower = sc.nextInt();
		System.out.println("Enter the upper limit : ");
		int upper = sc.nextInt();
		
		System.out.println("lower limit : " + lower);
		System.out.println("upper limit : " + upper);

		int evenSum = 0;
		int oddSum = 0;
		
		while(lower <= upper) {
			if (lower % 2 == 0) {
				evenSum += lower;
			} else {
				oddSum += lower;
			}
			lower++;
		}
		
		System.out.println("evenSum : " + evenSum);
		System.out.println("oddSum : " + oddSum);
		
		
		sc.close();
	}

}
