// Q.6 WAJP to replace an element in Linked list
package LAB17Nov;

import java.util.LinkedList; // importing LinedList

public class ReplaceElement {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>(); 	// creating new linkedlist named 'll'
		
		// adding elements in ll by add() method
		ll.add("India");
		ll.add("Japan");
		ll.add("Russia");
		ll.add("Iran");
		ll.add("USA");
		
		System.out.println("Before replacement : " + ll); 	// printing original linkedlist
		
		System.out.println("The element which is to be replaced : " + ll.get(4)); 	// element we want to replace
		ll.set(4,"China"); 								// replacing 
		System.out.println("After replacement : " + ll); 				// printing final linkedlist
	}
}
