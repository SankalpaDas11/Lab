/* Question 1. Write the following code:
1. A class named Arithmetic with a method named add that takes integers as parameters and 
returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic.
Input Format
test your submission by calling the add method 
on an Adder object and passing it integer parameters*/
import java.util.Scanner;
class Arithmetic { // parent class
	public int add(int a, int b) { // method to calculate sum with integer type input
		return (a+b); // logic
	}
}
public class Adder extends Arithmetic{ //child class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // scanner class
		System.out.print("Enter 1st value : "); // asking for input
		int x  = sc.nextInt(); // storing 1st input
		System.out.print("Enter 2nd value : ");
		int y  = sc.nextInt(); // storing 2nd value
		Arithmetic sum = new Arithmetic(); // creating object of parent class
		System.out.println("Result : " + sum.add(x, y)); // calling method of parent class
	}

}
