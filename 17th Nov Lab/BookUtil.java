package com.bookutil;

import java.util.Scanner;

import com.book.Book;
import com.book.BookStore;

public class BookUtil {
	public static void main(String ...args) {
		// initializing BookStore class
		BookStore bs = new BookStore();
		// for loop to take user input to read data from the user for 3 book object
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter BookId:- ");
			Scanner addBookId = new Scanner(System.in);
			String bookId = addBookId.nextLine();
			System.out.println("Enter Title:- ");
			Scanner addtitle = new Scanner(System.in);
			String title = addtitle.nextLine();
			System.out.println("Enter Author Name:- ");
			Scanner addAuthor = new Scanner(System.in);
 //		Scanner addSA = new Scanner(System.in);
//		String SA = addSA.nextLine();
//		bs.searchByAuthor(SA);
		bs.searchByTitle("Java");
//		bs.searchByAuthor("Mr.XYZ");
//		bs.displayAll();
	}
}}