package com.bookutil;

import java.util.Scanner;  //Scanner class 

import com.book.Book; 	// importing other to classes to access the methods
import com.book.BookStore;

public class BookUtil {
	public static void main(String ...args) {
									// initializing BookStore class
		BookStore bs = new BookStore();
									// for loop to take user input to read data from the user for 3 book object
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter The BookId : "); 	// asking the book id from user
			Scanner addBookId = new Scanner(System.in);	
			String bookId = addBookId.nextLine();		// storing book id
			
			System.out.println("Enter The Title : ");	// asking the title from user
			Scanner addtitle = new Scanner(System.in);
			String title = addtitle.nextLine();		// storing title
			
			System.out.println("Enter Author Name : ");	// asking the author name
			Scanner addAuthor = new Scanner(System.in);
 			Scanner addSA = new Scanner(System.in);		// storing the author name
		String SA = addSA.nextLine();
		bs.searchByAuthor(SA);					// calling method to search book by author name
		bs.searchByTitle("Java");				// calling method to search book by book title
		bs.searchByAuthor("Mr.XYZ");				
		bs.displayAll();					// showing all the details by calling method
	}
}}
