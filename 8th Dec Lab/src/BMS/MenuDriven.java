package BMS;

import java.sql.SQLException;
import java.util.Scanner;

import BMS.Close.CredentialMismatchException;
import BMS.Close.CloseAccount;
import BMS.Deposit.DepBal;
import BMS.OpenAcc.Open;
import BMS.ShowBal.ShowBal;
import BMS.Withdrawal.WitBal;

public class MenuDriven {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws SQLException, CredentialMismatchException {
		int variable;
		do{
		System.out.println("""
				~~~~~~Welcome to Laxmi Cheat Fund Banking Services~~~~~~
				      ----------21 din main paisa Double----------
				      
				Press 1 to open account in our bank 		:~
				Press 2 to check your account details 		:~
				Press 3 to deposit money in your account 	:~
				Press 4 to withdraw money from your account 	:~
				Press 5 to close your account 			:~
				Press 6 to exit 				:~ 
				""");
		variable = sc.nextInt(); 
		System.out.println("-------------------------------");
		switch(variable) {
		case 1 : 
			System.out.print("Enter 10 Numbers To Create A New Account Number  :");
	    	int acc_no=sc.nextInt();
	    	System.out.print("Enter Account Ifsc :");
	    	String ifsc_code=sc.next();
	    	System.out.print("Enter 4 Digits To Create A New Account Pin :");
	    	int pin=sc.nextInt();
			Open op = new Open();
			op.OpenNewAccount(acc_no,ifsc_code,pin);
			System.out.println();
			break;
		case 2 :  
			System.out.print("Enter Your Account Number: ");
			int p = sc.nextInt();
			System.out.print("Enter Your pin : ");
			int q = sc.nextInt();
			ShowBal sb = new ShowBal();
			sb.showAccountDetails(p,q);
			System.out.println();
			break;
		case 3 :
			System.out.print("Enter Your Account Number: ");
			int a = sc.nextInt();
			System.out.print("Enter Your pin : ");
			int b = sc.nextInt();
			DepBal db = new DepBal();
			db.DepositBalance(a, b);
			System.out.println();
			break;
		case 4 :
			System.out.print("Enter Your Account Number: ");
			int c = sc.nextInt();
			System.out.print("Enter Your pin : ");
			int d = sc.nextInt();
			WitBal wb = new WitBal();
			wb.WithdrawalBalance(c,d);
			System.out.println();
			break;
		case 5 :
			System.out.print("Enter Your Account Number: ");
			int e = sc.nextInt();
			System.out.print("Enter Your pin : ");
			int f = sc.nextInt();
			CloseAccount ca = new CloseAccount();
				ca.cloacc(e,f);
			System.out.println();
			break;
		case 6 :
			System.err.println("You have successfully logged out");
			System.out.println("--Thank You--");
			break;
		}}
		while(variable!=6);
	}
}

