/* Class A serves as a base class for the derived class B, which in turn 
serves as a base class for the derived class C. (Which type Of Inheritance 
explain with an example) */
// It is an example of Multilevel inheritence.
class A { // Parent class
	void job() {
		System.out.println("I am an Engineer");
	}
}
class B extends A{ // Child of class A
	void work() {
		super.job();
		System.out.println("I do java programming");
	}
}
public class C extends B { // child of class B

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(); // making object of parent class
		b.work(); // calling the parent class method
		System.out.println("I love my job");
	}

}