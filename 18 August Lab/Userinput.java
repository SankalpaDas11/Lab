// Q.3 Write a Java program that accepts two integers from the user and then print the sum, difference, product, average, distance, maximum, minimum. 
import java.util.Scanner;
public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the 1st integer: ");
		int a = sc.nextInt();
		System.out.println("Input the 2nd integer: ");
		int b = sc.nextInt();
		int sum = a+b; // logic of addition
		int sub = a-b; // logic of subtraction
		int mul = a*b; // logic of multiplication
		double ave = (double) (a+b)/2;
		int dis = Math.abs(a-b);
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		System.out.println("The sum is : " + sum); // printing the result of addition
		System.out.println("The subtraction is : " + sub); // printing the result of subtraction
		System.out.println("The multiplication is : " + mul); // printing the result of multiplication20
		System.out.println("The average is : " + ave); // printing the average
		System.out.println("The distance is : " + dis); // printing the distance
		System.out.println("The maximum number is : " + max); //printing the larger value
		System.out.println("The minimum number is : " + min); // printing the smaller value
	}

}