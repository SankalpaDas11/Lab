//Q.4 WAJP to compare two array lists

package LAB17Nov;

import java.util.ArrayList; 	// importing ArrayList
import java.util.List; 		// importing List

public class CompareArrayLists {

	public static void main(String[] args) {
		
		List<String> fll = new ArrayList<String>();		// creating new arraylist named 'fll'
		
		// adding elements in fll by add() method
		fll.add("India");
		fll.add("Japan");
		fll.add("Russia");
		fll.add("Iran");
		fll.add("China");
		System.out.println("1st array list : " + fll); 		// printing 1st array list
		
		List<String> sll = new ArrayList<String>(); 		// creating new arraylist named 'sll'
		
		// adding elements in sll by add() method
		sll.add("India");
		sll.add("Japan");
		sll.add("Russia");
		sll.add("China");
		System.out.println("2nd array list : " + sll); 		// printing 2nd array list
		
		for(String i : fll) {
			if(sll.contains(i)) 				// checking if the element is present or not
				System.out.println("Yes " + i + " is present in both the arraylist.");
			else
				System.out.println("No " + i + " is not present in the 2nd arraylist.");
		}
	}
}
