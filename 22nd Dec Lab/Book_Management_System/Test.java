package com.Book;

import java.util.Scanner;

import com.Book.daoimpl.UserImpl;

public class Test {
	public static void main(String[] args) {
	UserImpl um = new UserImpl();
	char ans;
	Scanner s = new Scanner(System.in);
	System.out.println("----Welcome to our library----");
	do {
	System.out.println("Enter choice : ");
	System.out.println(" 1. Add \n 2. Fetch \n 3. Exit");
	int ch = s.nextInt();
	switch(ch) {
	case 1 :
		um.addBook();
		break;
	case 2 :
		um.fetchBook();
		break;
	case 3 :
		System.out.println("--Thank You--");
		System.exit(0);
		break;
	default :
		System.out.println("Invalid Choice");
		break;
	}
	System.out.println("Do you want to do the process again? ");
	ans = s.next().charAt(0);
	} while (ans == 'y' || ans == 'Y');
	System.out.println("--Thank you--");
	}
}