package com.book;

public class Book {
	private String bookId; 					//declaring variables
	private String title;
	private String author;
	private String category;
	private float price;
								// Declaring parameterized constructor
	public Book(String bookId, String title, String author, String category, float price) {
		super();
		this.bookId = bookId;				 //connecting instance variable with local variables 
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	// getters and setters
	public String getBookId() { 				// method to ask for boook id
		return bookId;
	}
	public String getTitle() { 				// method to ask the book title
		return title;
	}
	public String getAuthor() { 				// method to ask author of the book
		return author;
	}
	public String getCategory() { 				// method to ask the book category(type)
		return category;
	}

	public float getPrice() { 				// method to ask the price of the book
		return price;
	}

		
	public boolean validation() throws Exception { 				// method to validate if the category falls in the specified options
		if(category == "Science" || category == "Fiction" || category == "Technology" || category == "Others" && price > 0 &&
				bookId.startsWith("B") && bookId.length() <= 4) {
			return true;
		} else {
			
			throw new InvalidBookException("Invalid Data..."); 	// showing warning to the user
		}
		
	}
	
}
class InvalidBookException extends Exception { 					// subclass of exception
	public InvalidBookException(String s) {
		super(s);
	}
}
