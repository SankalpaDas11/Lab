/* Q.3 Program to create library book Management system
to store and display book details in library where you can
create two classes one is main another one is library, where you can
create two methods as addBook,dispanseBook and
bookId,bookName,bookAuthor as instance variables */

class library{
	public int bookId; public String bookName; public String bookAuthor;
	public void addBook(int bookId, String bookName, String bookAuthor) { // 1st method to add books
		this.bookId=bookId; this.bookName=bookName; this.bookAuthor=bookAuthor;
		System.out.println("--Book added successfully--");
	System.out.println("ID : "+bookId+" "+"\nName : "+bookName+" "+"\nAuthor name : "+bookAuthor);
		}
	public void dispanceBook(int bookId, String bookName, String bookAuthor){//2nd method to borrow books
		this.bookId=bookId;
		this.bookName=bookName;
		this.bookAuthor=bookAuthor;
		System.out.println("--Book dispatched successfully--");
	System.out.println("ID : "+bookId+" "+"\nName : "+bookName+" "+"\nAuthor name : "+bookAuthor);}}
public class MainBook {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		library book = new library(); // object created
		book.addBook(277, "Geetobitan", "Tagore"); // calling 1st method
		book.dispanceBook(351, "Neeldarpan", "Bankim");}} // calling 2nd method
