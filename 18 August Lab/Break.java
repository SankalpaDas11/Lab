// Q.4 Write a java program to break an integer into a sequence of individual digits
import java.util.Scanner;
public class Break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the integer you want to break with six digits : ");
		int value = sc.nextInt(); // taking input value
		int a = value / 100000 % 10; // seperating the 1st digit
		int b = value / 10000 % 10; // seperating the 2nd digit
		int c = value / 1000 % 10; // seperating the 3rd digit
		int d = value / 100 % 10; // seperating the 4th digit 
		int e = value / 10 % 10; // seperating the 5th digit
		int f = value % 10; // seperating the 6th digit
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f); // printing the digits seperately
	}
}
