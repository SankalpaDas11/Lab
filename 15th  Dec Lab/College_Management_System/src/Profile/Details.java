package Profile;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Login.Helper;

public class Details {
 public static void show(long sid, String password) throws SQLException {
	 	Connection conn = Helper.con();
		Statement stmt = conn.createStatement();
		System.err.println("-------------------------------");
		System.out.println("Details of Your Profile:");
		ResultSet rs1 = stmt.executeQuery("select * from Registration where id ="+ sid +" and pswrd ='"+password+"'");
		while(rs1.next()) {
			System.err.println("Registration ID  : "+rs1.getLong(1));
			System.err.println("First Name       : "+rs1.getString(2));
			System.err.println("Last Name        : "+rs1.getString(3));
			System.err.println("Address          : "+rs1.getString(4));
			System.err.println("Phone Number     : "+rs1.getLong(5));
			System.err.println("10th Percentage  : "+rs1.getDouble(6));
			System.err.println("12th Percentage  : "+rs1.getDouble(7));
			System.err.println("Year of passing  : "+rs1.getInt(8));
			System.err.println("-------------------------------");
		}
}
}