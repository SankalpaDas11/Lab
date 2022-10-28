/*Q.2 Take two numbers x and y. 
 Throw the exception if the two numbers are negative 
 else print the product of x and y */

package Exception;
import java.util.Scanner;
class InvailException extends Exception { //sub class of exception
	public InvailException(String str) {
		super(str);
	}
}
class Product{ // class with power method
	public int product(int x, int y) throws InvailException{ //method power to calculate result
		if(x<0 && y<0) { // checking if any of the inputs is negative
			throw new 
			InvailException("java.lang.Exception: x and y both should not be negative");}
		else if (x==0 || y==0) { // checking if any of the inputs is 0
			throw new 
			InvailException("java.lang.Exception: x and y"
					+ " should not be 0");}
		else { // calculating result
		return x*y; // logic to return a long type result with n^p
		}
	}
}
public class ProductException { // class with main method
	public static void main(String[] args) throws InvailException { //main method
		Product p = new Product(); // creating object of the previous class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers to get the product : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		//calling power method with different inputs
		{try{System.out.println(p.product(x,y));}  
		catch(InvailException u) {
			System.out.println(u.getMessage());}}	
}}