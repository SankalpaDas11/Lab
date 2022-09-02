/* Q.2 you will make a class ‘Rectangle’ and declare the variable length and breadth as private. 
One Constructor will be used for initializing the value of variables. When an object is created, 
the constructor will be called and the default value of the instance variables will be assigned. 
Now create another new class ‘RectangleTest’ & create an object of class Rectangle and 
assign values of the parameter used in constructor. Calculate area of the rectangle and print 
it on the console. Let’s update the new value of variable. And then read the updated value. */
import java.util.Scanner;
public class RectangleTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // scanner class
		System.out.print("Enter 1st length : "); // taking inputs
		double x1 = sc.nextDouble(); 
		System.out.print("Enter 1st breadth : "); 
		double y1 = sc.nextDouble(); 
		System.out.print("Enter 2nd length : "); 
		double x2 = sc.nextDouble(); 
		System.out.print("Enter 2nd breadth : "); 
		double y2 = sc.nextDouble(); 
		Rectangle result1 = new Rectangle(x1,y1); // creating 1st object
		Rectangle result2 = new Rectangle(x2,y2); // creating 2nd object
		result1.area(); // printing the 1st result
		result2.area();  }} // printing the updated result
class Rectangle{
	private double length; // private variables
	private double breadth;
	Rectangle (double l, double b) { // costructor
		length = l;
		breadth = b; }
	void area() {
		System.out.println((length * breadth)); }} // logic to calculate area