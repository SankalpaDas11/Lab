package Admission;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Login.Helper;

public class Criteria {
public static void check(long sid, String password) throws SQLException {
	Connection conn = Helper.con();
	Statement stmt = conn.createStatement();
	ResultSet rs1 = stmt.executeQuery("select * from Registration where id ="+ sid +" and pswrd ='"+password+"'");
	while(rs1.next()) {
		String fname = rs1.getString(2);
		String lname = rs1.getString(3);
		String sadd = rs1.getString(4);
		long phone = rs1.getLong(5);
		double per10 = rs1.getDouble(6);
		double per12 = rs1.getDouble(7);
		int yop = rs1.getInt(8);
		if(per10 > 70 && per12 > 70) {
			System.err.println("--Great!! You are eligible for admission--");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Department in which you want admission : ");
			String dept = sc.next();
			PreparedStatement stmt1=conn.prepareStatement("insert into Admission values(?,?,?,?,?,?,?,?,?,?)");
	    	stmt1.setLong(1, sid);
	    	stmt1.setString(2, fname);
	    	stmt1.setString(3, lname);
	    	stmt1.setString(4, sadd);
	    	stmt1.setLong(5, phone);
	    	stmt1.setDouble(6, per10);
	    	stmt1.setDouble(7, per12);
	    	stmt1.setInt(8, yop);
	    	stmt1.setString(9, password);
	    	stmt1.setString(10, dept);

	    	stmt1.executeUpdate();
	    	System.out.println("You are successfully enroled in " + dept);
		}
		else {
			System.err.println("Sorry!! You are not eligible for admission:(");
		}
	}
}
}
