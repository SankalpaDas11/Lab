// Printing even numbers by an ArrayList
package Lab8Dec;

import java.util.ArrayList; 					// importing ArrayList

public class EvenArrayList {
	
	ArrayList<Integer> num = new ArrayList<Integer>(); 	// instance ArrayList 1
	ArrayList<Integer> num2 = new ArrayList<Integer>(); 	// instance ArrayList 2
	
	public ArrayList<Integer> storeEvenNumbers(int N) { 	// 1st method to store even numbers upto N
		for(int i = 2; i<N ; i=i+2)
			num.add(i); 				// adding even numbers in num ArrayList by add() method
		return num;
	}
	public ArrayList<Integer> printEvenNumbers() { 		// 2nd method to store the doubled integers in 2nd ArrayList
		for(int i : num) 				// iterating 1st ArrayList
			num2.add(i*2); 				// adding doubled even numbers in num2 ArrayList by add() method
		return num2;
	}
	public int retrieveEvenNumbers(int N) { 		// 3rd method to search specified even number
		int n = 0;
		for(int i : num) {
			if(i==N) 				// checking if specified number is present or not
				n = N;
		}
		return n;
	}
	public static void main(String[] args) { 		// main method to implement other methods
		// TODO Auto-generated method stub
		EvenArrayList ev = new EvenArrayList(); 	// object of the class
		System.out.println(ev.storeEvenNumbers(25)); 	// calling 1st method
		System.out.println(ev.printEvenNumbers()); 	// calling 2nd method
		System.out.println(ev.retrieveEvenNumbers(14)); // calling 3rd method
		System.out.println(ev.retrieveEvenNumbers(30));
	}
}
