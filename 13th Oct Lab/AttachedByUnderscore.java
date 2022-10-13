// Q.3 Write a Java program to find sequences of lowercase letters joined with a underscore.
package LabOct13th;
import java.util.Scanner; // importing Scanner
public class AttachedByUnderscore {

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // scanner class
		System.out.print("Please input your string to check : ");
		String input = sc.next(); // storing user input String
		if (input.matches("^[a-z]+_[a-z]+$")) { // checking whether the words are joined with an underscore
            System.out.println("Found a match!");}
		else {
            System.out.println("Not matched!");}
	}
}
