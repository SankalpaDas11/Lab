// Question 4
class Bank { // parent class
	float percentage = 10.0f;
	public float getRateOfInterest() {
		return percentage;
	}
}
class SBI extends Bank { //1st child
	public float getRateOfInterest() {
		return 8.0f;
	}
}
class ICICI extends Bank { //2nd child
	public float getRateOfInterest() {
		return 7.0f;
	}
}
class AXIS extends Bank { // 3rd child
	public float getRateOfInterest() {
		return 9.0f;
	}}
public class Interest { // class with main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object of the child classes
		SBI rate1 = new SBI(); 
		ICICI rate2 = new ICICI();
		AXIS rate3 = new AXIS();
		// calling methods
		System.out.println("The interest rate of SBI is : " + rate1.getRateOfInterest());
		System.out.println("The interest rate of ICICI is : " + rate2.getRateOfInterest());
		System.out.println("The interest rate of AXIS is : " + rate3.getRateOfInterest());
	}}
