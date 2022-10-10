package ArrayAssignment28th;
import java.util.Scanner;
public class SpecificElement {

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
		System.out.println("Please enter an element you want to search : "); // asking for element to search
		double find = sc.nextDouble(); 
		int flag=0;
		for(int j = 0; j< size; j++) {
			if(a[j]==find) {
				System.out.println("True");// if the element is present printing true
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("false");
		}
	}
}
