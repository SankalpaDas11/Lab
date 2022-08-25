// Q.1 Write a java program to find factorial of a given number.
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner class
		Scanner sc = new Scanner(System.in);
		// taking input from user
		System.out.print("Input any POSITIVE integer to calculate factorial : ");
		int num = sc.nextInt(); // storing the input value
		int factorial = 1; // initializing a variable to store the answer
		int i = 1;
		// starting if to check whether the input is positive or not
		if (num > 0) {
			for (i=1;i<=num;i++) {
				factorial = factorial * i; // logic to find facrorial
			} System.out.println("factorial of " + num + " is :" + factorial); // printing answer
		} else { 
			System.out.println("--Input Number is not POSITIVE--"); // printing warning for non positive input
		}
	}

}