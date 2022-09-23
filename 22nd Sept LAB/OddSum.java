// Q.1 Write a java program to print sum of odd numbers up to N.
import java.util.Scanner;
public class OddSum { 

	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class
		System.out.print("Input any integer upto which you want to add the odd numbers : "); // asking user input
		int limit = sc.nextInt(); // assigning input 
		int sum = 0; // taking one variable to store the result
		for (int i= 1; i<=limit; i++) {
			if (i%2!=0) { // logic
				sum += i;
			}
		}
		System.out.println("Result : " + sum); // printing the result
	}
}