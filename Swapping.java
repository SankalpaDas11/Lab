// Q.2 Swapping two variables refers to mutually exchanging the values of the variables.
class Swapping {
public static void main(String ...args) {
System.out.println("The inputs are : ");
int a = 10; // initialize the 1st input value
int b = 20; // initialize the 2nd input value
System.out.println(a + " , " + b ); // printing the 2 inputs
int temp;
temp = a; //taking 3rd variable to store the 1st input
a = b; //storing 2nd input to 1st variable
b = temp ;//storing 1st input to 2nd variable
System.out.println("The new order of the values is : " + a + " , " + b); // printing the result of swapping

}
}