//Q.2 class Calculator with add, sub and mul method
import java.util.Scanner;
 class Calculator {
	public double add(double a, double b) {
		return a + b;
	}
	public double sub(double a, double b) {
		return a-b;
	}
	public double mul(double a, double b) {
		return a*b;
	}
}
public class MainCal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Scanner class
		System.out.print("Please enter 1st input value : "); // asking user input
		double a = sc.nextDouble(); // assigning input 
		System.out.print("Please enter 2nd input value : ");
		double b = sc.nextDouble(); // taking one variable to store the result
		Calculator cal = new Calculator();
		System.out.println(cal.add(a, b)); // calling add method
		System.out.println(cal.sub(a, b)); // calling sub method
		System.out.println(cal.mul(a, b)); }} // calling mul method