// Q.5 Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data: Input first number: 125 Input second number: 24
class Calculator {
public static void main(String ...args) {
System.out.println("The two number is : ");
int a = 125; // initialize 1st local variable
int b = 24; // initialize 2nd local variable
int sum = a+b; // logic of addition
int sub = a-b; // logic of subtraction
int mul = a*b; // logic of multiplication
double div = (a/b); // logic of division
int rem = (a%b); // logic of remainder
System.out.println(a + " " + b); // 124,25
System.out.println("The sum is : " + sum); // printing the result of addition
System.out.println("The subtraction is : " + sub); // printing the result of subtraction
System.out.println("The multiplication is : " + mul); // printing the result of multiplication
System.out.println("The division is : " + div); // printing the result of division
System.out.println("The remainder is : " + rem); // printing the result of remainder
}
}