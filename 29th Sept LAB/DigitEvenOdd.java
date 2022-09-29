// Q.1 Write a Java method to check whether every digit of a given integer is even. Return true if every digit is odd otherwise false?
import java.util.Scanner;
public class DigitEvenOdd { 
	public static void check(int num) { // crearing method to check
		int n=num;	int digit=0; int flag=0; int count=0;
		while(num>0) { // starting while to count the number of digits
			num=num/10; 
			count++; }
		while (n>0) { // starting while to check if the digits are odd
			digit = n%10;
		    if(digit%2!=0) {
		    	flag+=1; }
		    n=n/10;}
		if(flag==count) { // checking if all of the digits are odd
			System.out.println("True"); }
		else {
			System.out.println("False"); }
	}
	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // scanner class
		System.out.println("Please enter an integer : "); // asking input
		int num = sc.nextInt(); // storing user input
		check(num); // calling method
	}
}