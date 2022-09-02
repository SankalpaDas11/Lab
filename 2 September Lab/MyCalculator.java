/* Q.1 You are given a class AdvancedArithmetic which contains a method signature int
divisor_sum(int n). You need to write another class called MyCalculator which implements the 
method.
divisorSum method just takes an integer as input and return the sum of all its divisors
The value of n will be at most 1000.*/
import java.util.Scanner;
public class MyCalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // scanner class
		System.out.print("Enter any integer less then 1000: "); // asking input from user
		int n = sc.nextInt(); // storing input in variable n
		AdvancedArithmetic result = new AdvancedArithmetic(); // creating object named result for AdvancedArithmetic class
		result.devisorSum(n); // implementing method devisorSum
		}}
class AdvancedArithmetic {
	void devisorSum(int n) {
		if (n<1000) { // checking if the input is less than 1000
			int sum = 0;
			for(int i=1; i<=n; i++) { // logic
				if (n%i==0) {
					 sum = sum + i;
				}
			} System.out.println(sum); //printing result 
		} else { 
			System.out.println("Given integer is greater than 1000"); // printing warning
			}}}