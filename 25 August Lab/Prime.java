// Q.2 Write a java program to find whether a given number is prime or not.
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int flag=0;
		// Scanner class
		Scanner sc = new Scanner(System.in);
		// taking input from user
		System.out.print("Input any POSITIVE integer to find whether it is prime or not : ");
		int num = sc.nextInt(); // storing the input value       
		int m=num/2; // as we know factor of any number is smaller than or equal to half of that number
		if(num==0||num==1){  // checking if the input is o or 1
		   System.out.println(num +" is not prime number");    // as o and 1 is not prime  
		  } else if (num < 0 ) { // checking whether the input is a negative integer
			  System.out.println("--Input is not Positive--"); // printing warning for negative input
		  } else{ 
		   for(i=2;i<=m;i++){      
		    if(num%i==0){      
		     System.out.println(num + " is not prime number");  // logic
		     flag=1; // noting if there exists any factor
		     break;      }}     
		   if(flag==0)  { System.out.println(num +" is prime number"); }  // printing result if there is no factor except 1 
		  }}}