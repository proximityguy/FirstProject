/*
2. Check if Two Strings are Anagrams - Write a method to check if two given strings are anagrams.
*/

package com.paritech.string;

//import java.util.Arrays;

public class CheckAnagrams {
//	method for sorting
	public static char[] arraySort(char[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
//	method for checking anagrams
	public static void checkAnagram(char[] arr1, char[] arr2) {
		
		boolean check = true;
		
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				check = false;
				break;
			}
		}
		
		if (check) {
			System.out.println("both strings are anagrams.!");
		} else {
			System.out.println("both strings are NOT Anagrams.!");
		}
	}

//	main method begins here 
	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";

		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);

		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		
//		Arrays.sort(str1Array);	// using Arrays.sort() method
//		Arrays.sort(str2Array);	// using Arrays.sort() method
		
//		manual sorting 
		char[] arr1 = new char[str1Array.length];
			arr1 = arraySort(str1Array);
			
		char[] arr2 = new char[str2Array.length];
			arr2 = arraySort(str2Array);

//		check anagrams
		if (arr1.length != arr2.length) {
			System.out.println("both strings are NOT Anagrams.!");
		} else {
			checkAnagram(arr1, arr2);
		}

	}

}
