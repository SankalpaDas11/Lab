package com.demo.main;

import java.util.Scanner; // importing Scanner

public class EvenTrue { // class contains the logic method
	public static boolean findEven() { // method to find if even or not 
		Scanner sc = new Scanner(System.in); // scanner object
		System.out.println("Enter a number to find even or odd :");	// asking integer to check from user
		int num = sc.nextInt();	// storing user input
		if(num%2==0) { // checking whether even or not
			System.out.println("Yes, "+ num + " is an even number."); // confirmation message for even
			return true;}
		else
			System.out.println("No, "+ num + " is an odd number."); // confirmation message for odd
			return false;
	}
}
