// Q.5 WAJP to insert the specified element at the front of a linked list
package LAB17Nov;

import java.util.LinkedList; // importing lined list

public class InsertFirst {

	public static void main(String[] args) {
LinkedList<String> ll = new LinkedList<String>(); // creating new linkedlist named 'll'
		
		// adding elements in ll by add() method
		ll.add("India");
		ll.add("Japan");
		ll.add("Russia");
		ll.add("Iran");
		ll.add("China");
		
		System.out.println("Before inserting : " + ll); // printing original linkedlist
		
		ll.addFirst("USA"); // adding element in the 1st position
		System.out.println("After inserting : " + ll); // printing final linkedlist
	}
}
