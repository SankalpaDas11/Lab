/*
Create a class MyCalculator which consists of a single method long power(int, int).
This method takes two integers, n and p, as parameters and finds n^p . If either n or
p is negative, then the method must throw an exception which says "n or p should
not be negative.". Also, if both n and p are zero, then the method must throw an
exception which says "n and p should not be zero."
*/
package Exception;
class InvailException extends Exception { 								//sub class of exception
	public InvailException(String str) {
		super(str);
	}
}
class MyCalculator{ // class with power method
	public long power(int n, int p) throws InvailException{ 					//method power to calculate result
		if(n<0||p<0) { 										// checking if any of the inputs is negative
			throw new 
			InvailException("java.lang.Exception: n and p should not be negative");}
		else if (n==0 || p==0) { // checking if any of the inputs is 0
			throw new 
			InvailException("java.lang.Exception: n and p should not be 0");}
		else { 											// calculating result
		return (long) Math.pow(n, p); // logic to return a long type result with n^p
		}
	}
}
public class MainCalculator { 										// class with main method
	public static void main(String[] args) throws InvailException { 				//main method
		MyCalculator p = new MyCalculator(); 							// creating object of the previous class
		
		//calling power method with different inputs
		System.out.println(p.power(12,2)); 			//input 1
		System.out.println(p.power(2,10)); 			//input2
		{try{System.out.println(p.power(0,2));} 		//input3
		catch(InvailException u) {
			System.out.println(u.getMessage());}}
		{try{System.out.println(p.power(2,-1));} 		//input4
		catch(InvailException u) {
			System.out.println(u.getMessage());}}
		
	}
}
