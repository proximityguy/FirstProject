/*
3. Find Duplicate Elements in an Array - Identify and print all duplicate elements in an integer array.
*/
package com.paritech.arrays;

import java.util.Scanner;

public class DistinctArrayElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		 int size = sc.nextInt();
		 
		 int[] originalArray = new int[size];
		 
		 System.out.println("enter elements in the array: ");
		 for (int i = 0; i < size; i++) {
			originalArray[i] = sc.nextInt();
		}

//		filtering distinct array
		 int[] distinctArray = new int[size];
		 distinctArray[0] = originalArray[0];
		 
		 for (int i = 0; i < originalArray.length; i++) {
			 
			for (int j = 0; j < distinctArray.length; j++) {
				if(distinctArray[j++] != originalArray[i]) {
					distinctArray[j] = originalArray[i];
				}
			}
		}
		 
		 System.out.println("distinct array: ");
		 for (int i = 0; i < distinctArray.length; i++) {
			System.out.println(distinctArray[i]);
		}
		 
		 
		 sc.close();
	}
}
