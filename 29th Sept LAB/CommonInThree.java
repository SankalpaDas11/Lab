// Q.5 Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.
import java.util.Arrays; // importing arrays
public class CommonInThree { 
	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
		int[]a= {7,5,4,8,9,11,1}; // array-1
		int[]b= {4,5,3,20,15,7,5}; //array-2
		int[]c= {1,17,4,6,5,8,9}; // array-3
		//sorting arrays in ascending order
		Arrays.sort(a); 
		Arrays.sort(b);
		Arrays.sort(c);
		System.out.println("The duplicate elemnets are : ");
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length
	               && k < c.length) {
			if (a[i] == b[j] && b[j] == c[k]) { // checking for common elements
                System.out.print(a[i] + " "); // printing common elements
                i++;
                j++;
                k++;
            }
			else if (a[i] < b[j]) { // changing index of the 1st array
                i++; }
			else if (b[j] < c[k]) { // changing index of the 2nd array
                j++;}
            else {
                k++;} // changing index of the 3rd array
		}}}
