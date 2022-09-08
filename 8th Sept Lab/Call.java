/* Develop a public java class and 
 * make sure nobody can create any object of this class from outside the class */
class Immutable{ // creating a class
	private Immutable() {} // making this private
}
public class Call { // creating a different class to call the previous class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immutable Calling = new immutable; 
		// trying ti make an object but it is showing error
	}

}
