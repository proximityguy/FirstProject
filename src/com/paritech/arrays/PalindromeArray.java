/*
7. Check if an Array is a Palindrome - Determine whether the given array is a palindrome.
*/
package com.paritech.arrays;
import java.util.Scanner;

public class PalindromeArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		
		int[] originalArray = new int[size];
		
		System.out.println("enter the elements in the array: ");
		
		for (int i = 0; i < size; i++) {
			originalArray[i] = sc.nextInt();
		}
		
		System.out.println("original array: ");
		for (int i = 0; i < originalArray.length; i++) {
			System.out.print(originalArray[i] + " ");
		}
		
//		to check array is palindrome or not
		boolean check = true;
		for (int i = 0; i < originalArray.length / 2; i++) {
			if(originalArray[i] != originalArray[originalArray.length - i - 1]) 
				check = false;
		}
		
		if (check) {
			System.out.println("\narray is palindrome");
		} else {
			System.out.println("\narray is NOT palindrome");
		}

		sc.close();
	}

}
