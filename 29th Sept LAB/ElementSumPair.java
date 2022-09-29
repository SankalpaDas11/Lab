// Q.4 a Java program to find all pairs of elements in an array whose sum is equal to a specified number

import java.util.Scanner;
public class ElementSumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class
		System.out.print("Please enter the array size : "); // asking for array size
		int size = sc.nextInt(); // storing the array size
		double a[] = new double[size]; // creating a new array
		for(int i = 0 ; i < size; i++) {
			System.out.print("Please enter " + (i+1) + "th element : " ); // asking for the elements 
			a[i] = sc.nextDouble(); // storing the array element
		}
		System.out.print("Enter the sum you want to get : "); // asking for the sum value
		int sum = sc.nextInt(); // storing the sum
		for(int i = 0; i< size; i++) {
			for(int j = i+1; j< size; j++) {
				if(a[j]+a[i]==sum) { // checking elements with sum
				System.out.println("The pair with the given sum is :" + a[i] +", " + a[j]); // printing result
}}}}}
