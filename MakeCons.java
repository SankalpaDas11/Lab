/*Can you create object of a class from inside the scope of 
another class constructor?*/

class cons {} // creating the 1st class
public class MakeCons { //creating a second class 
  MakeCons() { // constructor of this class 
	 cons obj = new cons(); //making object of the previous class inside this constructor
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object for the above constructor inside this class
		
	}

}