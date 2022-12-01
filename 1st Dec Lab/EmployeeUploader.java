package LabDec1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeUploader {
	static {
		 try {
		 	Class.forName("com.mysql.cj.jdbc.Driver");//registering my sql driver
	 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 }
	 public static Connection con()throws SQLException{
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","23October1999sd@#"); // connecting mysql driver
		 
	 }
	 	static Scanner sc = new Scanner(System.in); // scanner class object
		int e_id, e_contact, d_id; //column head instance variables
		float e_salary;
		String e_name, e_address,d_name,d_head,d_desc;
		//saving employee details in database
		public void storeDepartmentDetails()throws SQLException{ // 1st method to store department records
	    	System.out.println("Enter Department id :");
	    	d_id=sc.nextInt();
	    	System.out.println("enter Department name :");
	    	d_name=sc.next();
	    	System.out.println("Enter Department Head :");
	    	d_head=sc.next();
	    	System.out.println("Enter Department Description :");
	    	d_desc=sc.next();
	    	Connection conn=EmployeeUploader.con();
	    	PreparedStatement stmt=conn.prepareStatement("insert into Department values(?,?,?,?)");
	    	stmt.setInt(1, d_id);
	    	stmt.setString(2, d_name);
	    	stmt.setString(3, d_head);
	    	stmt.setString(4, d_desc);
	    	stmt.executeUpdate();
	    	System.out.println("----New Record Inserted----"); // confirmation
		}
		public void storeEmployeeDetails()throws SQLException{ // 2nd method to store employee records
	    	System.out.println("Enter Employee Id :");
	    	e_id=sc.nextInt();
	    	System.out.println("Enter Employee Name :");
	    	e_name=sc.next();
	    	System.out.println("Enter Employee Address :");
	    	e_address=sc.next();
	    	System.out.println("Enter Employee Salary :");
	    	e_salary=sc.nextFloat();
	    	System.out.println("Enter Employee Contact :");
	    	e_contact=sc.nextInt();
	    	System.out.println("Enter Department Id : ");
	    	d_id=sc.nextInt();
	    	Connection conn=EmployeeUploader.con();
	    	PreparedStatement stmt=conn.prepareStatement("insert into Employee values(?,?,?,?,?,?)");
	    	stmt.setInt(1, e_id);
	    	stmt.setString(2, e_name);
	    	stmt.setString(3, e_address);
	    	stmt.setFloat(4, e_salary);
	    	stmt.setInt(5, e_contact);
	    	stmt.setInt(6, d_id);
	    	stmt.executeUpdate();
	    	System.out.println("----New Record Inserted----"); //confirmation
		}
		public void retrieveEmployeeDetails() throws SQLException{ // 3rd method to display the records of both the tables
			Connection conn = EmployeeUploader.con();
			Statement stmt = conn.createStatement();
			ResultSet rs1=stmt.executeQuery("select * from Department");
			while(rs1.next()) {
			System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4));			
			}
			System.out.println("---------------------------\n");
			System.out.println("Details of Employee:");
			ResultSet rs2=stmt.executeQuery("select * from Employee");
			while(rs2.next()) {
				System.out.println(rs2.getInt(1)+" "+rs2.getString(2)+" "+rs2.getString(3)+" "+rs2.getFloat(4)+" "+rs2.getInt(5));			
			}
			System.out.println("---------------------------\n");
		}
	public void calculatePF(int e_id) throws SQLException{// 4th method to calculate pf of an employee by his id
		Connection conn = EmployeeUploader.con();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select e_salary from Employee where e_id ="+e_id); //fetching salary of an employee by his id
		while(rs.next()) {
			e_salary=rs.getInt(1); // storing the salary 
			System.out.println(e_salary);
			if(e_salary>=1000.00 && e_salary<1500) {
				float pf = (e_salary*5)/100;
				System.out.println("Employee PF amount is : " + pf);
			}
			else if(e_salary>=1500.00 && e_salary <2000) {
				float pf = (e_salary*6)/100;
				System.out.println("Employee PF amount is : " + pf);
			}
			else if(e_salary>=2000.00) {
				float pf = (e_salary*7)/100;
				System.out.println("Employee PF amount is : " + pf);
			}
		}
	}
	public void check() throws SQLIntegrityConstraintViolationException, SQLException{
		Connection conn = EmployeeUploader.con();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate("insert into Employee values(87,'Jack','Address6',1200,9942346,2)");
	}
	public static void main(String[] args) throws SQLException { // main method to invoke all of the previous methods
		EmployeeUploader eu = new EmployeeUploader();
		System.out.println("""
				Press 1 for Insert Department Records: 
				Press 2 for Insert Employee Records :
				Press 3 for Display Records :
				Press 4 for checking pf :
				Press 5 for Exit : 
				""");
		int variable = sc.nextInt(); // storing user choice 
		System.out.println("-------------------------------");
		switch(variable) { // switch case to perform exact operation according to user
		case 1 : 
			eu.storeDepartmentDetails(); // calling 1st method
			break;
		case 2 :  
			eu.storeEmployeeDetails(); // calling 2nd method
			break;
		case 3 :
			System.out.println("Details of Department:");
			eu.retrieveEmployeeDetails();// calling 3rd method
		case 4 :
			System.out.println("Enter employee id :"); // asking for the employee id to calculate his pf
			int id = sc.nextInt(); // storing user's choice
			eu.calculatePF(id); // calling 4th method
		case 5 :
			System.out.println("--Thank You--");
		}
	}
}
