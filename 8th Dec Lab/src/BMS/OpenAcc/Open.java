package BMS.OpenAcc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import BMS.Helper;
import BMS.Close.CredentialMismatchException;

public class Open {
	int acc_no,pin,db_acc,db_pin;
	String acc_holder, acc_type, ifsc_code, branch,db_ifsc;
	Double balance;
	Scanner sc = new Scanner(System.in);
	public void OpenNewAccount(int acc_no,String ifsc_code,int pin)throws SQLException,CredentialMismatchException{
		Connection conn = Helper.con();
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from bank where acc_no ="+ acc_no +" and pin ="+pin);
		while(rs.next()) {
			db_acc = rs.getInt(1);
			db_ifsc = rs.getString(3);
			db_pin=rs.getInt(7);
		}
		if(db_acc==acc_no) {
			throw new CredentialMismatchException("!!EXISTING ACCOUNT NUMBER/PIN/IFSC CODE INSERTED!!");
		}
		else{System.out.print("Enter Your Name :");
    	acc_holder=sc.next();
    	System.out.print("Enter Branch:");
    	branch=sc.next();
    	System.out.print("Enter Account type:");
    	acc_type=sc.next();
    	System.out.print("Enter Opening Balance :");
    	balance=sc.nextDouble();
    	PreparedStatement stmt2=conn.prepareStatement("insert into Bank values(?,?,?,?,?,?,?)");
    	stmt2.setInt(1, acc_no);
    	stmt2.setString(2, acc_holder);
    	stmt2.setString(3, ifsc_code);
    	stmt2.setString(4, branch);
    	stmt2.setString(5, acc_type);
    	stmt2.setDouble(6, balance);
    	stmt2.setInt(7, pin);
    	stmt2.executeUpdate();
    	System.err.println("----New Account Created----"); }
	}
}
