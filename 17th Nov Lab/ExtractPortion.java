// Q.3 WAJP to extract a portion of an array list
package LAB17Nov;

import java.util.ArrayList; // importing ArrayList
import java.util.List; // List

public class ExtractPortion {

	public static void main(String[] args) {
		List<String> fll = new ArrayList<String>(); // creating new arraylist named 'fll'
		
		// adding elements in fll by add() method
		fll.add("India");
		fll.add("Japan");
		fll.add("Russia");
		fll.add("Iran");
		fll.add("China");
		System.out.println("1st array list : " + fll); // printing 1st array list

		List<String> sll = new ArrayList<String>(); // creating new arraylist named 'sll'
		sll = fll.subList(0, 3); // extracting 1st position to 3rd position
		System.out.println("2nd array list : " + sll); // printing sdcond arraylist
	}
}
