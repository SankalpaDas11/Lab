/* Q.2 Banking Operations reate a class with customer private instance variables as accountNumber,accountName,accountBalance and 
create methods as 1. create account 2. setAmount 3. getAmount 4. withDrawAmount */
import java.util.Scanner;
class Account {
	// private instance variable
	private long accountNumber; private String accountName; 
	private double accountBalance; double amount;
	//1st method to create a new account
	public void createAccount(long accountNumber, String accountName, double accountBalance) {
		this.accountNumber=accountNumber;
		this.accountName=accountName;
		this.accountBalance=accountBalance; }
	//2nd method to assign account balance
	public void setAmount(double accountBalance) {
		this.accountBalance=accountBalance; }
	//3rd method to get the account balance with account name
	public void getAmount() {
		System.out.println(accountName + ": " + accountBalance); }
	// 4th method to get new balance after withdrawing
	public void withdrawAmount(double amount) {
		accountBalance= accountBalance-amount;
		System.out.println(accountBalance); }
}
public class MainBank { // main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account(); // creating object of the previous class
		a.createAccount(4187l, "Sankalpa", 100d); // inserting values
		Scanner sc = new Scanner(System.in); // scanner class
		a.setAmount(10000d); // calling 2nd method
		a.getAmount(); // calling 3rd method
		System.out.println("enter the withdraw amount : "); //
		double amount = sc.nextDouble();
		a.withdrawAmount(amount); }}// calling 4th method