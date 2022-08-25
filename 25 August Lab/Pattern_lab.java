// Q.3 Write a java program to build a pyramid by user input.
import java.util.Scanner;
public class Pattern_lab {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class
		System.out.print("Input how many steps do you want to build the pyramid: ");
		int input = sc.nextInt(); // storing input in a variable
		for (int i=0; i<input; i++) // number of rows
        {
            for (int j=input-i; j>1; j--)
            {  
                System.out.print(" "); // printing spaces
            }
            for (int j=0; j<=i; j++ )
            { 
                System.out.print("* "); // printing stars
            }
            System.out.println(); }}} // ending line after each row