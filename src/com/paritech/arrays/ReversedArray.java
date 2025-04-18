/*
1. Reverse an Array - Write a program to reverse the elements of an array.
*/
package com.paritech.arrays;

import java.util.Scanner;

public class ReversedArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array: ");
		int arraySize = sc.nextInt();
		
		int[] originalArray = new int[arraySize];
		
		System.out.println("enter elements in the array: ");
		for (int i = 0; i < arraySize; i++) {
			originalArray[i] = sc.nextInt();
		}
		
		System.out.println("original array: ");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(originalArray[i] + " ");
		}
		
//		reversing the array
		int temp;
		for (int i = 0; i < arraySize / 2; i++) {
			temp = originalArray[i];
			originalArray[i] = originalArray[arraySize - i - 1];
			originalArray[arraySize - i - 1] = temp;
		}
		
		System.out.println("\nreversed array: ");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(originalArray[i] + " ");
		}
		
		sc.close();
	}

}
